package tbclient.GetGameCenter;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_ST_TYPE = "";
    @ProtoField(tag = 4)
    public final CommonReq common;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer page_num;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer recommend_platform;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer res_num;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String st_type;
    public static final Integer DEFAULT_PAGE_NUM = 0;
    public static final Integer DEFAULT_RES_NUM = 0;
    public static final Integer DEFAULT_RECOMMEND_PLATFORM = 0;

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
            } else {
                this.res_num = builder.res_num;
            }
            if (builder.st_type == null) {
                this.st_type = "";
            } else {
                this.st_type = builder.st_type;
            }
            this.common = builder.common;
            if (builder.recommend_platform == null) {
                this.recommend_platform = DEFAULT_RECOMMEND_PLATFORM;
                return;
            } else {
                this.recommend_platform = builder.recommend_platform;
                return;
            }
        }
        this.page_num = builder.page_num;
        this.res_num = builder.res_num;
        this.st_type = builder.st_type;
        this.common = builder.common;
        this.recommend_platform = builder.recommend_platform;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataReq> {
        public CommonReq common;
        public Integer page_num;
        public Integer recommend_platform;
        public Integer res_num;
        public String st_type;

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.page_num = dataReq.page_num;
                this.res_num = dataReq.res_num;
                this.st_type = dataReq.st_type;
                this.common = dataReq.common;
                this.recommend_platform = dataReq.recommend_platform;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z, null);
        }
    }
}
