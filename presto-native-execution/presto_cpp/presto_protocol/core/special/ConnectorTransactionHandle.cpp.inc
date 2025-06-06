/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// dependency TpchTransactionHandle
// dependency ArrowTransactionHandle

namespace facebook::presto::protocol {
void to_json(json& j, const std::shared_ptr<ConnectorTransactionHandle>& p) {
  if (p == nullptr) {
    return;
  }
  String type = p->_type;

  if (type == "$remote") {
    j = *std::static_pointer_cast<RemoteTransactionHandle>(p);
    return;
  }
  getConnectorProtocol(type).to_json(j, p);
}

void from_json(const json& j, std::shared_ptr<ConnectorTransactionHandle>& p) {
  String type;
  try {
    type = p->getSubclassKey(j);
  } catch (json::parse_error& e) {
    throw ParseError(
        std::string(e.what()) +
        " ConnectorTransactionHandle  ConnectorTransactionHandle");
  }

  if (type == "$remote") {
    auto k = std::make_shared<RemoteTransactionHandle>();
    j.get_to(*k);
    p = k;
    return;
  }
  getConnectorProtocol(type).from_json(j, p);
}
} // namespace facebook::presto::protocol
