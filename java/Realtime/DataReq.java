package tbclient.Realtime;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes22.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_ABTEST_TAG = "";
    public static final String DEFAULT_ORI_UGC_NID = "";
    public static final String DEFAULT_ORI_UGC_TID = "";
    public static final String DEFAULT_ORI_UGC_TYPE = "";
    public static final String DEFAULT_ORI_UGC_VID = "";
    public static final String DEFAULT_PAGE = "";
    public static final String DEFAULT_SOURCE = "";
    public static final String DEFAULT_WEIGHT = "";
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String abtest_tag;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f5324common;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer location;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String ori_ugc_nid;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String ori_ugc_tid;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String ori_ugc_type;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String ori_ugc_vid;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String page;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String source;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long tid;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer type;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String weight;
    public static final Long DEFAULT_TID = 0L;
    public static final Integer DEFAULT_LOCATION = 0;
    public static final Integer DEFAULT_TYPE = 0;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f5324common = builder.f5325common;
            if (builder.tid == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = builder.tid;
            }
            if (builder.weight == null) {
                this.weight = "";
            } else {
                this.weight = builder.weight;
            }
            if (builder.source == null) {
                this.source = "";
            } else {
                this.source = builder.source;
            }
            if (builder.location == null) {
                this.location = DEFAULT_LOCATION;
            } else {
                this.location = builder.location;
            }
            if (builder.abtest_tag == null) {
                this.abtest_tag = "";
            } else {
                this.abtest_tag = builder.abtest_tag;
            }
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.page == null) {
                this.page = "";
            } else {
                this.page = builder.page;
            }
            if (builder.ori_ugc_nid == null) {
                this.ori_ugc_nid = "";
            } else {
                this.ori_ugc_nid = builder.ori_ugc_nid;
            }
            if (builder.ori_ugc_tid == null) {
                this.ori_ugc_tid = "";
            } else {
                this.ori_ugc_tid = builder.ori_ugc_tid;
            }
            if (builder.ori_ugc_type == null) {
                this.ori_ugc_type = "";
            } else {
                this.ori_ugc_type = builder.ori_ugc_type;
            }
            if (builder.ori_ugc_vid == null) {
                this.ori_ugc_vid = "";
                return;
            } else {
                this.ori_ugc_vid = builder.ori_ugc_vid;
                return;
            }
        }
        this.f5324common = builder.f5325common;
        this.tid = builder.tid;
        this.weight = builder.weight;
        this.source = builder.source;
        this.location = builder.location;
        this.abtest_tag = builder.abtest_tag;
        this.type = builder.type;
        this.page = builder.page;
        this.ori_ugc_nid = builder.ori_ugc_nid;
        this.ori_ugc_tid = builder.ori_ugc_tid;
        this.ori_ugc_type = builder.ori_ugc_type;
        this.ori_ugc_vid = builder.ori_ugc_vid;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public String abtest_tag;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f5325common;
        public Integer location;
        public String ori_ugc_nid;
        public String ori_ugc_tid;
        public String ori_ugc_type;
        public String ori_ugc_vid;
        public String page;
        public String source;
        public Long tid;
        public Integer type;
        public String weight;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f5325common = dataReq.f5324common;
                this.tid = dataReq.tid;
                this.weight = dataReq.weight;
                this.source = dataReq.source;
                this.location = dataReq.location;
                this.abtest_tag = dataReq.abtest_tag;
                this.type = dataReq.type;
                this.page = dataReq.page;
                this.ori_ugc_nid = dataReq.ori_ugc_nid;
                this.ori_ugc_tid = dataReq.ori_ugc_tid;
                this.ori_ugc_type = dataReq.ori_ugc_type;
                this.ori_ugc_vid = dataReq.ori_ugc_vid;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
