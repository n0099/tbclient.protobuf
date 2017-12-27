package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_AGE_TAG = "";
    public static final String DEFAULT_DA_IDFA = "";
    public static final String DEFAULT_LASTIDS = "";
    public static final String DEFAULT_PLATFORM = "";
    public static final String DEFAULT_SEX_TAG = "";
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String age_tag;
    @ProtoField(tag = 1)
    public final CommonReq common;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String da_idfa;
    @ProtoField(label = Message.Label.REPEATED, tag = 20, type = Message.Datatype.STRING)
    public final List<String> interest_tag;
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
    @ProtoField(tag = 23, type = Message.Datatype.UINT32)
    public final Integer new_net_type;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer page_thread_count;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String platform;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer pn;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer q_type;
    @ProtoField(tag = 10, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer scr_h;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer scr_w;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String sex_tag;
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

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.common = builder.common;
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
                return;
            } else {
                this.new_net_type = builder.new_net_type;
                return;
            }
        }
        this.common = builder.common;
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
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public String age_tag;
        public CommonReq common;
        public String da_idfa;
        public List<String> interest_tag;
        public Integer issdk;
        public String lastids;
        public Integer load_type;
        public Integer need_age_module;
        public Integer need_forumlist;
        public Integer need_tags;
        public Integer new_net_type;
        public Integer page_thread_count;
        public String platform;
        public Integer pn;
        public Integer q_type;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public String sex_tag;
        public Integer sug_count;
        public Integer tag_changed;
        public Integer tag_code;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.common = dataReq.common;
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
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
