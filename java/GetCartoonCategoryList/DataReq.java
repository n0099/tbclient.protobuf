package tbclient.GetCartoonCategoryList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_CARTOON_CATEGORY_ID = 0;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_RN = 0;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer cartoon_category_id;
    @ProtoField(tag = 1)
    public final CommonReq common;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer rn;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.common = builder.common;
            if (builder.cartoon_category_id == null) {
                this.cartoon_category_id = DEFAULT_CARTOON_CATEGORY_ID;
            } else {
                this.cartoon_category_id = builder.cartoon_category_id;
            }
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = builder.pn;
            }
            if (builder.rn == null) {
                this.rn = DEFAULT_RN;
                return;
            } else {
                this.rn = builder.rn;
                return;
            }
        }
        this.common = builder.common;
        this.cartoon_category_id = builder.cartoon_category_id;
        this.pn = builder.pn;
        this.rn = builder.rn;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public Integer cartoon_category_id;
        public CommonReq common;
        public Integer pn;
        public Integer rn;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.common = dataReq.common;
                this.cartoon_category_id = dataReq.cartoon_category_id;
                this.pn = dataReq.pn;
                this.rn = dataReq.rn;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
