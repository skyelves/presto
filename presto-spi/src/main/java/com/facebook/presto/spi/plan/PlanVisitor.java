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
package com.facebook.presto.spi.plan;

public abstract class PlanVisitor<R, C>
{
    /**
     * The default behavior to perform when visiting a PlanNode
     */
    public abstract R visitPlan(PlanNode node, C context);

    public R visitOutput(OutputNode node, C context)
    {
        return visitPlan(node, context);
    }

    public R visitAggregation(AggregationNode node, C context)
    {
        return visitPlan(node, context);
    }

    public R visitProject(ProjectNode node, C context)
    {
        return visitPlan(node, context);
    }

    public R visitFilter(FilterNode node, C context)
    {
        return visitPlan(node, context);
    }

    public R visitTableScan(TableScanNode node, C context)
    {
        return visitPlan(node, context);
    }

    public R visitSort(SortNode node, C context)
    {
        return visitPlan(node, context);
    }

    public R visitUnion(UnionNode node, C context)
    {
        return visitPlan(node, context);
    }

    public R visitIntersect(IntersectNode node, C context)
    {
        return visitPlan(node, context);
    }

    public R visitExcept(ExceptNode node, C context)
    {
        return visitPlan(node, context);
    }

    public R visitValues(ValuesNode node, C context)
    {
        return visitPlan(node, context);
    }

    public R visitLimit(LimitNode node, C context)
    {
        return visitPlan(node, context);
    }

    public R visitMarkDistinct(MarkDistinctNode node, C context)
    {
        return visitPlan(node, context);
    }

    public R visitTopN(TopNNode node, C context)
    {
        return visitPlan(node, context);
    }

    public R visitDistinctLimit(DistinctLimitNode node, C context)
    {
        return visitPlan(node, context);
    }

    public R visitCteReference(CteReferenceNode node, C context)
    {
        return visitPlan(node, context);
    }

    public R visitCteProducer(CteProducerNode node, C context)
    {
        return visitPlan(node, context);
    }

    public R visitCteConsumer(CteConsumerNode node, C context)
    {
        return visitPlan(node, context);
    }

    public R visitWindow(WindowNode node, C context)
    {
        return visitPlan(node, context);
    }

    public R visitJoin(JoinNode node, C context)
    {
        return visitPlan(node, context);
    }

    public R visitSemiJoin(SemiJoinNode node, C context)
    {
        return visitPlan(node, context);
    }

    public R visitSpatialJoin(SpatialJoinNode node, C context)
    {
        return visitPlan(node, context);
    }

    public R visitMergeJoin(MergeJoinNode node, C context)
    {
        return visitPlan(node, context);
    }

    public R visitDelete(DeleteNode node, C context)
    {
        return visitPlan(node, context);
    }

    public R visitTableWriter(TableWriterNode node, C context)
    {
        return visitPlan(node, context);
    }

    public R visitTableFinish(TableFinishNode node, C context)
    {
        return visitPlan(node, context);
    }

    public R visitIndexSource(IndexSourceNode node, C context)
    {
        return visitPlan(node, context);
    }

    public R visitUnnest(UnnestNode node, C context)
    {
        return visitPlan(node, context);
    }

    public R visitMetadataDelete(MetadataDeleteNode node, C context)
    {
        return visitPlan(node, context);
    }
}
