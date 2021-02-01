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
    public final CommonReq f14745common;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer follow_type;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long last_req_unix;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer load_type;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String page_tag;
    public static final Long DEFAULT_LAST_REQ_UNIX = 0L;
    public static final Integer DEFAULT_FOLLOW_TYPE = 0;
    public static final Integer DEFAULT_LOAD_TYPE = 0;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f14745common = builder.f14746common;
            if (builder.page_tag == null) {
                this.page_tag = "";
            } else {
                this.page_tag = builder.page_tag;
            }
            if (builder.last_req_unix == null) {
                this.last_req_unix = DEFAULT_LAST_REQ_UNIX;
            } else {
                this.last_req_unix = builder.last_req_unix;
            }
            if (builder.follow_type == null) {
                this.follow_type = DEFAULT_FOLLOW_TYPE;
            } else {
                this.follow_type = builder.follow_type;
            }
            if (builder.load_type == null) {
                this.load_type = DEFAULT_LOAD_TYPE;
            } else {
                this.load_type = builder.load_type;
            }
            if (builder.ad_ext_params == null) {
                this.ad_ext_params = "";
                return;
            } else {
                this.ad_ext_params = builder.ad_ext_params;
                return;
            }
        }
        this.f14745common = builder.f14746common;
        this.page_tag = builder.page_tag;
        this.last_req_unix = builder.last_req_unix;
        this.follow_type = builder.follow_type;
        this.load_type = builder.load_type;
        this.ad_ext_params = builder.ad_ext_params;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public String ad_ext_params;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14746common;
        public Integer follow_type;
        public Long last_req_unix;
        public Integer load_type;
        public String page_tag;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f14746common = dataReq.f14745common;
                this.page_tag = dataReq.page_tag;
                this.last_req_unix = dataReq.last_req_unix;
                this.follow_type = dataReq.follow_type;
                this.load_type = dataReq.load_type;
                this.ad_ext_params = dataReq.ad_ext_params;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
