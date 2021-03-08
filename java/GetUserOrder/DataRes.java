package tbclient.GetUserOrder;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.DefaultInfo;
import tbclient.OrderList;
/* loaded from: classes8.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 6)
    public final DefaultInfo default_info;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer hasmore;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<OrderList> order_list;
    public static final List<OrderList> DEFAULT_ORDER_LIST = Collections.emptyList();
    public static final Integer DEFAULT_HASMORE = 0;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.order_list == null) {
                this.order_list = DEFAULT_ORDER_LIST;
            } else {
                this.order_list = immutableCopyOf(builder.order_list);
            }
            if (builder.hasmore == null) {
                this.hasmore = DEFAULT_HASMORE;
            } else {
                this.hasmore = builder.hasmore;
            }
            this.default_info = builder.default_info;
            return;
        }
        this.order_list = immutableCopyOf(builder.order_list);
        this.hasmore = builder.hasmore;
        this.default_info = builder.default_info;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public DefaultInfo default_info;
        public Integer hasmore;
        public List<OrderList> order_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.order_list = DataRes.copyOf(dataRes.order_list);
                this.hasmore = dataRes.hasmore;
                this.default_info = dataRes.default_info;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
