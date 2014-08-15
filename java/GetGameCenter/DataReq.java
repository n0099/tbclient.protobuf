package tbclient.GetGameCenter;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_PAGE_NUM = 0;
    public static final Integer DEFAULT_RES_NUM = 0;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer page_num;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer res_num;

    /* synthetic */ DataReq(Builder builder, boolean z, DataReq dataReq) {
        this(builder, z);
    }

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.page_num == null) {
                this.page_num = DEFAULT_PAGE_NUM;
            } else {
                this.page_num = builder.page_num;
            }
            if (builder.res_num == null) {
                this.res_num = DEFAULT_RES_NUM;
                return;
            } else {
                this.res_num = builder.res_num;
                return;
            }
        }
        this.page_num = builder.page_num;
        this.res_num = builder.res_num;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataReq> {
        public Integer page_num;
        public Integer res_num;

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.page_num = dataReq.page_num;
                this.res_num = dataReq.res_num;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z, null);
        }
    }
}
