package tbclient.Userlike;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_AD_EXT_PARAMS = "";
    public static final String DEFAULT_PAGE_TAG = "";
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String ad_ext_params;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1514common;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer follow_type;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer is_newfeed;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long last_req_unix;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer load_type;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String page_tag;
    public static final Long DEFAULT_LAST_REQ_UNIX = 0L;
    public static final Integer DEFAULT_FOLLOW_TYPE = 0;
    public static final Integer DEFAULT_LOAD_TYPE = 0;
    public static final Integer DEFAULT_IS_NEWFEED = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public String ad_ext_params;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1515common;
        public Integer follow_type;
        public Integer is_newfeed;
        public Long last_req_unix;
        public Integer load_type;
        public String page_tag;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1515common = dataReq.f1514common;
            this.page_tag = dataReq.page_tag;
            this.last_req_unix = dataReq.last_req_unix;
            this.follow_type = dataReq.follow_type;
            this.load_type = dataReq.load_type;
            this.ad_ext_params = dataReq.ad_ext_params;
            this.is_newfeed = dataReq.is_newfeed;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1514common = builder.f1515common;
            String str = builder.page_tag;
            if (str == null) {
                this.page_tag = "";
            } else {
                this.page_tag = str;
            }
            Long l = builder.last_req_unix;
            if (l == null) {
                this.last_req_unix = DEFAULT_LAST_REQ_UNIX;
            } else {
                this.last_req_unix = l;
            }
            Integer num = builder.follow_type;
            if (num == null) {
                this.follow_type = DEFAULT_FOLLOW_TYPE;
            } else {
                this.follow_type = num;
            }
            Integer num2 = builder.load_type;
            if (num2 == null) {
                this.load_type = DEFAULT_LOAD_TYPE;
            } else {
                this.load_type = num2;
            }
            String str2 = builder.ad_ext_params;
            if (str2 == null) {
                this.ad_ext_params = "";
            } else {
                this.ad_ext_params = str2;
            }
            Integer num3 = builder.is_newfeed;
            if (num3 == null) {
                this.is_newfeed = DEFAULT_IS_NEWFEED;
                return;
            } else {
                this.is_newfeed = num3;
                return;
            }
        }
        this.f1514common = builder.f1515common;
        this.page_tag = builder.page_tag;
        this.last_req_unix = builder.last_req_unix;
        this.follow_type = builder.follow_type;
        this.load_type = builder.load_type;
        this.ad_ext_params = builder.ad_ext_params;
        this.is_newfeed = builder.is_newfeed;
    }
}
