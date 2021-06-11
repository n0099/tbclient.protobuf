package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes8.dex */
public final class OrderData extends Message {
    @ProtoField(tag = 3)
    public final DefaultInfo default_info;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer hasmore;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<OrderList> order_list;
    public static final List<OrderList> DEFAULT_ORDER_LIST = Collections.emptyList();
    public static final Integer DEFAULT_HASMORE = 0;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<OrderData> {
        public DefaultInfo default_info;
        public Integer hasmore;
        public List<OrderList> order_list;

        public Builder() {
        }

        public Builder(OrderData orderData) {
            super(orderData);
            if (orderData == null) {
                return;
            }
            this.order_list = Message.copyOf(orderData.order_list);
            this.hasmore = orderData.hasmore;
            this.default_info = orderData.default_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public OrderData build(boolean z) {
            return new OrderData(this, z);
        }
    }

    public OrderData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<OrderList> list = builder.order_list;
            if (list == null) {
                this.order_list = DEFAULT_ORDER_LIST;
            } else {
                this.order_list = Message.immutableCopyOf(list);
            }
            Integer num = builder.hasmore;
            if (num == null) {
                this.hasmore = DEFAULT_HASMORE;
            } else {
                this.hasmore = num;
            }
            this.default_info = builder.default_info;
            return;
        }
        this.order_list = Message.immutableCopyOf(builder.order_list);
        this.hasmore = builder.hasmore;
        this.default_info = builder.default_info;
    }
}
