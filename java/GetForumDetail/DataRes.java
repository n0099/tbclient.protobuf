package tbclient.GetForumDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.BawuThrones;
import tbclient.ForumMemberInfo;
import tbclient.HotUserRankEntry;
import tbclient.ManagerApplyInfo;
import tbclient.PriManagerApplyInfo;
import tbclient.RecommendForumInfo;
import tbclient.ServiceArea;
import tbclient.SimpleThreadInfo;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_IS_BAZHU_SHOW = "";
    @ProtoField(tag = 12)
    public final ApplyStatus apply_status;
    @ProtoField(label = Message.Label.REPEATED, tag = 11)
    public final List<BawuAction> bawu_actions;
    @ProtoField(tag = 17)
    public final BawuThrones bawu_thrones;
    @ProtoField(tag = 15)
    public final BazhuGrade bazhu_grade;
    @ProtoField(tag = 13)
    public final BazhuUniversity bazhu_university;
    @ProtoField(tag = 5)
    public final ManagerApplyInfo bz_apply_info;
    @ProtoField(tag = 3)
    public final BzApplySwitch bz_apply_switch;
    @ProtoField(tag = 8)
    public final ManagerElectionTab election_tab;
    @ProtoField(tag = 10)
    public final ForumDataCenter forum_data;
    @ProtoField(tag = 1)
    public final RecommendForumInfo forum_info;
    @ProtoField(tag = 21)
    public final ForumMemberInfo forum_member;
    @ProtoField(tag = 19)
    public final HotUserRankEntry hot_user_entry;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_bawu_show;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String is_bazhu_show;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer is_complaint_show;
    @ProtoField(tag = 16, type = Message.Datatype.INT32)
    public final Integer is_forum_card_enable;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer is_forum_data_show;
    @ProtoField(tag = 7)
    public final PriManagerApplyInfo pribz_apply_info;
    @ProtoField(tag = 20)
    public final ServiceArea small_app;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<SimpleThreadInfo> thread_list;
    public static final List<SimpleThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    public static final Integer DEFAULT_IS_BAWU_SHOW = 0;
    public static final Integer DEFAULT_IS_COMPLAINT_SHOW = 0;
    public static final Integer DEFAULT_IS_FORUM_DATA_SHOW = 0;
    public static final List<BawuAction> DEFAULT_BAWU_ACTIONS = Collections.emptyList();
    public static final Integer DEFAULT_IS_FORUM_CARD_ENABLE = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public ApplyStatus apply_status;
        public List<BawuAction> bawu_actions;
        public BawuThrones bawu_thrones;
        public BazhuGrade bazhu_grade;
        public BazhuUniversity bazhu_university;
        public ManagerApplyInfo bz_apply_info;
        public BzApplySwitch bz_apply_switch;
        public ManagerElectionTab election_tab;
        public ForumDataCenter forum_data;
        public RecommendForumInfo forum_info;
        public ForumMemberInfo forum_member;
        public HotUserRankEntry hot_user_entry;
        public Integer is_bawu_show;
        public String is_bazhu_show;
        public Integer is_complaint_show;
        public Integer is_forum_card_enable;
        public Integer is_forum_data_show;
        public PriManagerApplyInfo pribz_apply_info;
        public ServiceArea small_app;
        public List<SimpleThreadInfo> thread_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.forum_info = dataRes.forum_info;
            this.thread_list = Message.copyOf(dataRes.thread_list);
            this.bz_apply_switch = dataRes.bz_apply_switch;
            this.is_bawu_show = dataRes.is_bawu_show;
            this.bz_apply_info = dataRes.bz_apply_info;
            this.is_complaint_show = dataRes.is_complaint_show;
            this.pribz_apply_info = dataRes.pribz_apply_info;
            this.election_tab = dataRes.election_tab;
            this.is_forum_data_show = dataRes.is_forum_data_show;
            this.forum_data = dataRes.forum_data;
            this.bawu_actions = Message.copyOf(dataRes.bawu_actions);
            this.apply_status = dataRes.apply_status;
            this.bazhu_university = dataRes.bazhu_university;
            this.bazhu_grade = dataRes.bazhu_grade;
            this.is_forum_card_enable = dataRes.is_forum_card_enable;
            this.bawu_thrones = dataRes.bawu_thrones;
            this.is_bazhu_show = dataRes.is_bazhu_show;
            this.hot_user_entry = dataRes.hot_user_entry;
            this.small_app = dataRes.small_app;
            this.forum_member = dataRes.forum_member;
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
            this.forum_info = builder.forum_info;
            List<SimpleThreadInfo> list = builder.thread_list;
            if (list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = Message.immutableCopyOf(list);
            }
            this.bz_apply_switch = builder.bz_apply_switch;
            Integer num = builder.is_bawu_show;
            if (num == null) {
                this.is_bawu_show = DEFAULT_IS_BAWU_SHOW;
            } else {
                this.is_bawu_show = num;
            }
            this.bz_apply_info = builder.bz_apply_info;
            Integer num2 = builder.is_complaint_show;
            if (num2 == null) {
                this.is_complaint_show = DEFAULT_IS_COMPLAINT_SHOW;
            } else {
                this.is_complaint_show = num2;
            }
            this.pribz_apply_info = builder.pribz_apply_info;
            this.election_tab = builder.election_tab;
            Integer num3 = builder.is_forum_data_show;
            if (num3 == null) {
                this.is_forum_data_show = DEFAULT_IS_FORUM_DATA_SHOW;
            } else {
                this.is_forum_data_show = num3;
            }
            this.forum_data = builder.forum_data;
            List<BawuAction> list2 = builder.bawu_actions;
            if (list2 == null) {
                this.bawu_actions = DEFAULT_BAWU_ACTIONS;
            } else {
                this.bawu_actions = Message.immutableCopyOf(list2);
            }
            this.apply_status = builder.apply_status;
            this.bazhu_university = builder.bazhu_university;
            this.bazhu_grade = builder.bazhu_grade;
            Integer num4 = builder.is_forum_card_enable;
            if (num4 == null) {
                this.is_forum_card_enable = DEFAULT_IS_FORUM_CARD_ENABLE;
            } else {
                this.is_forum_card_enable = num4;
            }
            this.bawu_thrones = builder.bawu_thrones;
            String str = builder.is_bazhu_show;
            if (str == null) {
                this.is_bazhu_show = "";
            } else {
                this.is_bazhu_show = str;
            }
            this.hot_user_entry = builder.hot_user_entry;
            this.small_app = builder.small_app;
            this.forum_member = builder.forum_member;
            return;
        }
        this.forum_info = builder.forum_info;
        this.thread_list = Message.immutableCopyOf(builder.thread_list);
        this.bz_apply_switch = builder.bz_apply_switch;
        this.is_bawu_show = builder.is_bawu_show;
        this.bz_apply_info = builder.bz_apply_info;
        this.is_complaint_show = builder.is_complaint_show;
        this.pribz_apply_info = builder.pribz_apply_info;
        this.election_tab = builder.election_tab;
        this.is_forum_data_show = builder.is_forum_data_show;
        this.forum_data = builder.forum_data;
        this.bawu_actions = Message.immutableCopyOf(builder.bawu_actions);
        this.apply_status = builder.apply_status;
        this.bazhu_university = builder.bazhu_university;
        this.bazhu_grade = builder.bazhu_grade;
        this.is_forum_card_enable = builder.is_forum_card_enable;
        this.bawu_thrones = builder.bawu_thrones;
        this.is_bazhu_show = builder.is_bazhu_show;
        this.hot_user_entry = builder.hot_user_entry;
        this.small_app = builder.small_app;
        this.forum_member = builder.forum_member;
    }
}
