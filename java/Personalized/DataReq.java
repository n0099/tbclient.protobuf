package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AppPosInfo;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_AD_CONTEXT_LIST = "";
    public static final String DEFAULT_AD_EXT_PARAMS = "";
    public static final String DEFAULT_AGE_TAG = "";
    public static final String DEFAULT_DA_IDFA = "";
    public static final String DEFAULT_FIRST_DIR = "";
    public static final String DEFAULT_INVOKE_SOURCE = "";
    public static final String DEFAULT_LASTIDS = "";
    public static final String DEFAULT_PLATFORM = "";
    public static final String DEFAULT_QUERY_EQID = "";
    public static final String DEFAULT_SECOND_DIR = "";
    public static final String DEFAULT_SEX_TAG = "";
    public static final String DEFAULT_SHOUBAI_CUID = "";
    @ProtoField(tag = 30, type = Message.Datatype.STRING)
    public final String ad_context_list;
    @ProtoField(tag = 37, type = Message.Datatype.STRING)
    public final String ad_ext_params;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String age_tag;
    @ProtoField(tag = 36)
    public final AppPosInfo app_pos;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f8887common;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String da_idfa;
    @ProtoField(tag = 34, type = Message.Datatype.STRING)
    public final String first_dir;
    @ProtoField(tag = 25, type = Message.Datatype.INT64)
    public final Long from_tid;
    @ProtoField(label = Message.Label.REPEATED, tag = 20, type = Message.Datatype.STRING)
    public final List<String> interest_tag;
    @ProtoField(tag = 29, type = Message.Datatype.STRING)
    public final String invoke_source;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer issdk;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String lastids;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer load_type;
    @ProtoField(tag = 19, type = Message.Datatype.UINT32)
    public final Integer need_age_module;
    @ProtoField(tag = 22, type = Message.Datatype.UINT32)
    public final Integer need_forumlist;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer need_tags;
    @ProtoField(tag = 27, type = Message.Datatype.INT32)
    public final Integer new_install;
    @ProtoField(tag = 23, type = Message.Datatype.UINT32)
    public final Integer new_net_type;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer page_thread_count;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String platform;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer pn;
    @ProtoField(tag = 26, type = Message.Datatype.INT32)
    public final Integer pre_ad_thread_count;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer q_type;
    @ProtoField(tag = 33, type = Message.Datatype.STRING)
    public final String query_eqid;
    @ProtoField(tag = 28, type = Message.Datatype.INT32)
    public final Integer request_times;
    @ProtoField(tag = 10, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer scr_h;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer scr_w;
    @ProtoField(tag = 35, type = Message.Datatype.STRING)
    public final String second_dir;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String sex_tag;
    @ProtoField(tag = 24, type = Message.Datatype.STRING)
    public final String shoubai_cuid;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer sug_count;
    @ProtoField(tag = 21, type = Message.Datatype.UINT32)
    public final Integer tag_changed;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer tag_code;
    public static final Integer DEFAULT_TAG_CODE = 0;
    public static final Integer DEFAULT_NEED_TAGS = 0;
    public static final Integer DEFAULT_LOAD_TYPE = 0;
    public static final Integer DEFAULT_PAGE_THREAD_COUNT = 0;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_SUG_COUNT = 0;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Double DEFAULT_SCR_DIP = Double.valueOf(0.0d);
    public static final Integer DEFAULT_Q_TYPE = 0;
    public static final Integer DEFAULT_ISSDK = 0;
    public static final Integer DEFAULT_NEED_AGE_MODULE = 0;
    public static final List<String> DEFAULT_INTEREST_TAG = Collections.emptyList();
    public static final Integer DEFAULT_TAG_CHANGED = 0;
    public static final Integer DEFAULT_NEED_FORUMLIST = 0;
    public static final Integer DEFAULT_NEW_NET_TYPE = 0;
    public static final Long DEFAULT_FROM_TID = 0L;
    public static final Integer DEFAULT_PRE_AD_THREAD_COUNT = 0;
    public static final Integer DEFAULT_NEW_INSTALL = 0;
    public static final Integer DEFAULT_REQUEST_TIMES = 0;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f8887common = builder.f8888common;
            if (builder.tag_code == null) {
                this.tag_code = DEFAULT_TAG_CODE;
            } else {
                this.tag_code = builder.tag_code;
            }
            if (builder.need_tags == null) {
                this.need_tags = DEFAULT_NEED_TAGS;
            } else {
                this.need_tags = builder.need_tags;
            }
            if (builder.load_type == null) {
                this.load_type = DEFAULT_LOAD_TYPE;
            } else {
                this.load_type = builder.load_type;
            }
            if (builder.page_thread_count == null) {
                this.page_thread_count = DEFAULT_PAGE_THREAD_COUNT;
            } else {
                this.page_thread_count = builder.page_thread_count;
            }
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = builder.pn;
            }
            if (builder.sug_count == null) {
                this.sug_count = DEFAULT_SUG_COUNT;
            } else {
                this.sug_count = builder.sug_count;
            }
            if (builder.scr_w == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = builder.scr_w;
            }
            if (builder.scr_h == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = builder.scr_h;
            }
            if (builder.scr_dip == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = builder.scr_dip;
            }
            if (builder.q_type == null) {
                this.q_type = DEFAULT_Q_TYPE;
            } else {
                this.q_type = builder.q_type;
            }
            if (builder.lastids == null) {
                this.lastids = "";
            } else {
                this.lastids = builder.lastids;
            }
            if (builder.issdk == null) {
                this.issdk = DEFAULT_ISSDK;
            } else {
                this.issdk = builder.issdk;
            }
            if (builder.da_idfa == null) {
                this.da_idfa = "";
            } else {
                this.da_idfa = builder.da_idfa;
            }
            if (builder.platform == null) {
                this.platform = "";
            } else {
                this.platform = builder.platform;
            }
            if (builder.sex_tag == null) {
                this.sex_tag = "";
            } else {
                this.sex_tag = builder.sex_tag;
            }
            if (builder.age_tag == null) {
                this.age_tag = "";
            } else {
                this.age_tag = builder.age_tag;
            }
            if (builder.need_age_module == null) {
                this.need_age_module = DEFAULT_NEED_AGE_MODULE;
            } else {
                this.need_age_module = builder.need_age_module;
            }
            if (builder.interest_tag == null) {
                this.interest_tag = DEFAULT_INTEREST_TAG;
            } else {
                this.interest_tag = immutableCopyOf(builder.interest_tag);
            }
            if (builder.tag_changed == null) {
                this.tag_changed = DEFAULT_TAG_CHANGED;
            } else {
                this.tag_changed = builder.tag_changed;
            }
            if (builder.need_forumlist == null) {
                this.need_forumlist = DEFAULT_NEED_FORUMLIST;
            } else {
                this.need_forumlist = builder.need_forumlist;
            }
            if (builder.new_net_type == null) {
                this.new_net_type = DEFAULT_NEW_NET_TYPE;
            } else {
                this.new_net_type = builder.new_net_type;
            }
            if (builder.shoubai_cuid == null) {
                this.shoubai_cuid = "";
            } else {
                this.shoubai_cuid = builder.shoubai_cuid;
            }
            if (builder.from_tid == null) {
                this.from_tid = DEFAULT_FROM_TID;
            } else {
                this.from_tid = builder.from_tid;
            }
            if (builder.pre_ad_thread_count == null) {
                this.pre_ad_thread_count = DEFAULT_PRE_AD_THREAD_COUNT;
            } else {
                this.pre_ad_thread_count = builder.pre_ad_thread_count;
            }
            if (builder.new_install == null) {
                this.new_install = DEFAULT_NEW_INSTALL;
            } else {
                this.new_install = builder.new_install;
            }
            if (builder.request_times == null) {
                this.request_times = DEFAULT_REQUEST_TIMES;
            } else {
                this.request_times = builder.request_times;
            }
            if (builder.invoke_source == null) {
                this.invoke_source = "";
            } else {
                this.invoke_source = builder.invoke_source;
            }
            if (builder.ad_context_list == null) {
                this.ad_context_list = "";
            } else {
                this.ad_context_list = builder.ad_context_list;
            }
            if (builder.query_eqid == null) {
                this.query_eqid = "";
            } else {
                this.query_eqid = builder.query_eqid;
            }
            if (builder.first_dir == null) {
                this.first_dir = "";
            } else {
                this.first_dir = builder.first_dir;
            }
            if (builder.second_dir == null) {
                this.second_dir = "";
            } else {
                this.second_dir = builder.second_dir;
            }
            this.app_pos = builder.app_pos;
            if (builder.ad_ext_params == null) {
                this.ad_ext_params = "";
                return;
            } else {
                this.ad_ext_params = builder.ad_ext_params;
                return;
            }
        }
        this.f8887common = builder.f8888common;
        this.tag_code = builder.tag_code;
        this.need_tags = builder.need_tags;
        this.load_type = builder.load_type;
        this.page_thread_count = builder.page_thread_count;
        this.pn = builder.pn;
        this.sug_count = builder.sug_count;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.q_type = builder.q_type;
        this.lastids = builder.lastids;
        this.issdk = builder.issdk;
        this.da_idfa = builder.da_idfa;
        this.platform = builder.platform;
        this.sex_tag = builder.sex_tag;
        this.age_tag = builder.age_tag;
        this.need_age_module = builder.need_age_module;
        this.interest_tag = immutableCopyOf(builder.interest_tag);
        this.tag_changed = builder.tag_changed;
        this.need_forumlist = builder.need_forumlist;
        this.new_net_type = builder.new_net_type;
        this.shoubai_cuid = builder.shoubai_cuid;
        this.from_tid = builder.from_tid;
        this.pre_ad_thread_count = builder.pre_ad_thread_count;
        this.new_install = builder.new_install;
        this.request_times = builder.request_times;
        this.invoke_source = builder.invoke_source;
        this.ad_context_list = builder.ad_context_list;
        this.query_eqid = builder.query_eqid;
        this.first_dir = builder.first_dir;
        this.second_dir = builder.second_dir;
        this.app_pos = builder.app_pos;
        this.ad_ext_params = builder.ad_ext_params;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public String ad_context_list;
        public String ad_ext_params;
        public String age_tag;
        public AppPosInfo app_pos;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f8888common;
        public String da_idfa;
        public String first_dir;
        public Long from_tid;
        public List<String> interest_tag;
        public String invoke_source;
        public Integer issdk;
        public String lastids;
        public Integer load_type;
        public Integer need_age_module;
        public Integer need_forumlist;
        public Integer need_tags;
        public Integer new_install;
        public Integer new_net_type;
        public Integer page_thread_count;
        public String platform;
        public Integer pn;
        public Integer pre_ad_thread_count;
        public Integer q_type;
        public String query_eqid;
        public Integer request_times;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public String second_dir;
        public String sex_tag;
        public String shoubai_cuid;
        public Integer sug_count;
        public Integer tag_changed;
        public Integer tag_code;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f8888common = dataReq.f8887common;
                this.tag_code = dataReq.tag_code;
                this.need_tags = dataReq.need_tags;
                this.load_type = dataReq.load_type;
                this.page_thread_count = dataReq.page_thread_count;
                this.pn = dataReq.pn;
                this.sug_count = dataReq.sug_count;
                this.scr_w = dataReq.scr_w;
                this.scr_h = dataReq.scr_h;
                this.scr_dip = dataReq.scr_dip;
                this.q_type = dataReq.q_type;
                this.lastids = dataReq.lastids;
                this.issdk = dataReq.issdk;
                this.da_idfa = dataReq.da_idfa;
                this.platform = dataReq.platform;
                this.sex_tag = dataReq.sex_tag;
                this.age_tag = dataReq.age_tag;
                this.need_age_module = dataReq.need_age_module;
                this.interest_tag = DataReq.copyOf(dataReq.interest_tag);
                this.tag_changed = dataReq.tag_changed;
                this.need_forumlist = dataReq.need_forumlist;
                this.new_net_type = dataReq.new_net_type;
                this.shoubai_cuid = dataReq.shoubai_cuid;
                this.from_tid = dataReq.from_tid;
                this.pre_ad_thread_count = dataReq.pre_ad_thread_count;
                this.new_install = dataReq.new_install;
                this.request_times = dataReq.request_times;
                this.invoke_source = dataReq.invoke_source;
                this.ad_context_list = dataReq.ad_context_list;
                this.query_eqid = dataReq.query_eqid;
                this.first_dir = dataReq.first_dir;
                this.second_dir = dataReq.second_dir;
                this.app_pos = dataReq.app_pos;
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
