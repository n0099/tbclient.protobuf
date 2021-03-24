package tbclient.Realtime;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
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
    public final CommonReq f68575common;
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

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public String abtest_tag;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f68576common;
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
            if (dataReq == null) {
                return;
            }
            this.f68576common = dataReq.f68575common;
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

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f68575common = builder.f68576common;
            Long l = builder.tid;
            if (l == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l;
            }
            String str = builder.weight;
            if (str == null) {
                this.weight = "";
            } else {
                this.weight = str;
            }
            String str2 = builder.source;
            if (str2 == null) {
                this.source = "";
            } else {
                this.source = str2;
            }
            Integer num = builder.location;
            if (num == null) {
                this.location = DEFAULT_LOCATION;
            } else {
                this.location = num;
            }
            String str3 = builder.abtest_tag;
            if (str3 == null) {
                this.abtest_tag = "";
            } else {
                this.abtest_tag = str3;
            }
            Integer num2 = builder.type;
            if (num2 == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num2;
            }
            String str4 = builder.page;
            if (str4 == null) {
                this.page = "";
            } else {
                this.page = str4;
            }
            String str5 = builder.ori_ugc_nid;
            if (str5 == null) {
                this.ori_ugc_nid = "";
            } else {
                this.ori_ugc_nid = str5;
            }
            String str6 = builder.ori_ugc_tid;
            if (str6 == null) {
                this.ori_ugc_tid = "";
            } else {
                this.ori_ugc_tid = str6;
            }
            String str7 = builder.ori_ugc_type;
            if (str7 == null) {
                this.ori_ugc_type = "";
            } else {
                this.ori_ugc_type = str7;
            }
            String str8 = builder.ori_ugc_vid;
            if (str8 == null) {
                this.ori_ugc_vid = "";
                return;
            } else {
                this.ori_ugc_vid = str8;
                return;
            }
        }
        this.f68575common = builder.f68576common;
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
}
