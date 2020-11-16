package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes21.dex */
public final class TbreadDispatch extends Message {
    public static final String DEFAULT_FLOOR_NUM = "";
    public static final String DEFAULT_PRODUCT_ID = "";
    public static final String DEFAULT_PRODUCT_TYPE = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String floor_num;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String product_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String product_type;

    private TbreadDispatch(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.floor_num == null) {
                this.floor_num = "";
            } else {
                this.floor_num = builder.floor_num;
            }
            if (builder.product_type == null) {
                this.product_type = "";
            } else {
                this.product_type = builder.product_type;
            }
            if (builder.product_id == null) {
                this.product_id = "";
                return;
            } else {
                this.product_id = builder.product_id;
                return;
            }
        }
        this.floor_num = builder.floor_num;
        this.product_type = builder.product_type;
        this.product_id = builder.product_id;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<TbreadDispatch> {
        public String floor_num;
        public String product_id;
        public String product_type;

        public Builder() {
        }

        public Builder(TbreadDispatch tbreadDispatch) {
            super(tbreadDispatch);
            if (tbreadDispatch != null) {
                this.floor_num = tbreadDispatch.floor_num;
                this.product_type = tbreadDispatch.product_type;
                this.product_id = tbreadDispatch.product_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TbreadDispatch build(boolean z) {
            return new TbreadDispatch(this, z);
        }
    }
}
