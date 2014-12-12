package tbclient.GetSingleGameList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)
    public final CommonReq common;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer page_num;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer recommend_platform;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer res_num;
    public static final Integer DEFAULT_RECOMMEND_PLATFORM = 0;
    public static final Integer DEFAULT_PAGE_NUM = 0;
    public static final Integer DEFAULT_RES_NUM = 0;

    /* synthetic */ DataReq(Builder builder, boolean z, DataReq dataReq) {
        this(builder, z);
    }

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.common = builder.common;
            if (builder.recommend_platform == null) {
                this.recommend_platform = DEFAULT_RECOMMEND_PLATFORM;
            } else {
                this.recommend_platform = builder.recommend_platform;
            }
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
        this.common = builder.common;
        this.recommend_platform = builder.recommend_platform;
        this.page_num = builder.page_num;
        this.res_num = builder.res_num;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataReq> {
        public CommonReq common;
        public Integer page_num;
        public Integer recommend_platform;
        public Integer res_num;

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.common = dataReq.common;
                this.recommend_platform = dataReq.recommend_platform;
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
