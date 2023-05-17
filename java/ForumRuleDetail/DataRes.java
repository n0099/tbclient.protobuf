package tbclient.ForumRuleDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.BawuRoleInfoPub;
import tbclient.ForumInfo;
import tbclient.ForumRule;
/* loaded from: classes10.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_AUDIT_OPINION = "";
    public static final String DEFAULT_CUR_TIME = "";
    public static final String DEFAULT_PREFACE = "";
    public static final String DEFAULT_PUBLISH_TIME = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String audit_opinion;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer audit_status;
    @ProtoField(tag = 11)
    public final BawuRoleInfoPub bazhu;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String cur_time;
    @ProtoField(tag = 2)
    public final ForumInfo forum;
    @ProtoField(tag = 9, type = Message.Datatype.INT64)
    public final Long forum_rule_id;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer is_manager;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String preface;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String publish_time;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<ForumRule> rules;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String title;
    public static final List<ForumRule> DEFAULT_RULES = Collections.emptyList();
    public static final Integer DEFAULT_AUDIT_STATUS = 0;
    public static final Integer DEFAULT_IS_MANAGER = 0;
    public static final Long DEFAULT_FORUM_RULE_ID = 0L;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public String audit_opinion;
        public Integer audit_status;
        public BawuRoleInfoPub bazhu;
        public String cur_time;
        public ForumInfo forum;
        public Long forum_rule_id;
        public Integer is_manager;
        public String preface;
        public String publish_time;
        public List<ForumRule> rules;
        public String title;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.forum = dataRes.forum;
            this.title = dataRes.title;
            this.preface = dataRes.preface;
            this.rules = Message.copyOf(dataRes.rules);
            this.audit_status = dataRes.audit_status;
            this.audit_opinion = dataRes.audit_opinion;
            this.is_manager = dataRes.is_manager;
            this.forum_rule_id = dataRes.forum_rule_id;
            this.publish_time = dataRes.publish_time;
            this.bazhu = dataRes.bazhu;
            this.cur_time = dataRes.cur_time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.forum = builder.forum;
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.preface;
            if (str2 == null) {
                this.preface = "";
            } else {
                this.preface = str2;
            }
            List<ForumRule> list = builder.rules;
            if (list == null) {
                this.rules = DEFAULT_RULES;
            } else {
                this.rules = Message.immutableCopyOf(list);
            }
            Integer num = builder.audit_status;
            if (num == null) {
                this.audit_status = DEFAULT_AUDIT_STATUS;
            } else {
                this.audit_status = num;
            }
            String str3 = builder.audit_opinion;
            if (str3 == null) {
                this.audit_opinion = "";
            } else {
                this.audit_opinion = str3;
            }
            Integer num2 = builder.is_manager;
            if (num2 == null) {
                this.is_manager = DEFAULT_IS_MANAGER;
            } else {
                this.is_manager = num2;
            }
            Long l = builder.forum_rule_id;
            if (l == null) {
                this.forum_rule_id = DEFAULT_FORUM_RULE_ID;
            } else {
                this.forum_rule_id = l;
            }
            String str4 = builder.publish_time;
            if (str4 == null) {
                this.publish_time = "";
            } else {
                this.publish_time = str4;
            }
            this.bazhu = builder.bazhu;
            String str5 = builder.cur_time;
            if (str5 == null) {
                this.cur_time = "";
                return;
            } else {
                this.cur_time = str5;
                return;
            }
        }
        this.forum = builder.forum;
        this.title = builder.title;
        this.preface = builder.preface;
        this.rules = Message.immutableCopyOf(builder.rules);
        this.audit_status = builder.audit_status;
        this.audit_opinion = builder.audit_opinion;
        this.is_manager = builder.is_manager;
        this.forum_rule_id = builder.forum_rule_id;
        this.publish_time = builder.publish_time;
        this.bazhu = builder.bazhu;
        this.cur_time = builder.cur_time;
    }
}
