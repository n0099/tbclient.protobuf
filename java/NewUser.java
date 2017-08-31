package tbclient;

import com.baidu.tieba.d;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class NewUser extends Message {
    public static final String DEFAULT_BG_ID = "";
    public static final String DEFAULT_BILLBOARD = "";
    public static final String DEFAULT_CARD = "";
    public static final String DEFAULT_CDN_ERROR = "";
    public static final String DEFAULT_FREE_FLAG = "";
    public static final String DEFAULT_IS_COREUSER = "";
    public static final String DEFAULT_IS_DOUDIZHU = "";
    public static final String DEFAULT_IS_INTERESTMAN = "";
    public static final String DEFAULT_PAPER = "";
    public static final String DEFAULT_PORTRAIT_TIME = "";
    public static final String DEFAULT_TBSCORE_REPEATE_FINISH_TIME = "";
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 22)
    public final List<Props> appraise;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String bg_id;
    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String billboard;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String card;
    @ProtoField(tag = 30, type = Message.Datatype.STRING)
    public final String cdn_error;
    @ProtoField(tag = d.n.View_clickable, type = Message.Datatype.STRING)
    public final String free_flag;
    @ProtoField(tag = 33)
    public final GameAttr game_attr;
    @ProtoField(tag = 35)
    public final Global global;
    @ProtoField(tag = 32, type = Message.Datatype.STRING)
    public final String is_coreuser;
    @ProtoField(tag = 29, type = Message.Datatype.STRING)
    public final String is_doudizhu;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer is_group_owner;
    @ProtoField(tag = 19, type = Message.Datatype.INT32)
    public final Integer is_hardworking;
    @ProtoField(tag = 34, type = Message.Datatype.STRING)
    public final String is_interestman;
    @ProtoField(tag = 24, type = Message.Datatype.INT32)
    public final Integer is_member;
    @ProtoField(tag = 25, type = Message.Datatype.INT32)
    public final Integer is_passer;
    @ProtoField(tag = 26, type = Message.Datatype.INT32)
    public final Integer is_qun_spring;
    @ProtoField(tag = 18, type = Message.Datatype.INT32)
    public final Integer is_shengyou;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer is_tenyear;
    @ProtoField(tag = 9)
    public final MparrProps m_parr_props;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer meizhi_level;
    @ProtoField(label = Message.Label.REPEATED, tag = 27)
    public final List<NoticeMask> notice_mask;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String paper;
    @ProtoField(tag = 8)
    public final ParrProps parr_props;
    @ProtoField(tag = 13)
    public final ParrScores parr_scores;
    @ProtoField(tag = 21, type = Message.Datatype.STRING)
    public final String portrait_time;
    @ProtoField(label = Message.Label.REPEATED, tag = 28)
    public final List<Rpgoldicon> rpgoldicon;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer superboy;
    @ProtoField(label = Message.Label.REPEATED, tag = 31)
    public final List<TbmallMonthIcon> tbmall_month_icon;
    @ProtoField(tag = 23, type = Message.Datatype.STRING)
    public final String tbscore_repeate_finish_time;
    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public final Integer use_sig;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer user_sex;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer user_status;
    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer user_type;
    @ProtoField(tag = 10)
    public final WapRn wap_rn;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_USER_SEX = 0;
    public static final Integer DEFAULT_USER_STATUS = 0;
    public static final Integer DEFAULT_MEIZHI_LEVEL = 0;
    public static final Integer DEFAULT_SUPERBOY = 0;
    public static final Integer DEFAULT_IS_TENYEAR = 0;
    public static final Integer DEFAULT_IS_GROUP_OWNER = 0;
    public static final Integer DEFAULT_USER_TYPE = 0;
    public static final Integer DEFAULT_USE_SIG = 0;
    public static final Integer DEFAULT_IS_SHENGYOU = 0;
    public static final Integer DEFAULT_IS_HARDWORKING = 0;
    public static final List<Props> DEFAULT_APPRAISE = Collections.emptyList();
    public static final Integer DEFAULT_IS_MEMBER = 0;
    public static final Integer DEFAULT_IS_PASSER = 0;
    public static final Integer DEFAULT_IS_QUN_SPRING = 0;
    public static final List<NoticeMask> DEFAULT_NOTICE_MASK = Collections.emptyList();
    public static final List<Rpgoldicon> DEFAULT_RPGOLDICON = Collections.emptyList();
    public static final List<TbmallMonthIcon> DEFAULT_TBMALL_MONTH_ICON = Collections.emptyList();

    private NewUser(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            if (builder.user_name == null) {
                this.user_name = "";
            } else {
                this.user_name = builder.user_name;
            }
            if (builder.user_sex == null) {
                this.user_sex = DEFAULT_USER_SEX;
            } else {
                this.user_sex = builder.user_sex;
            }
            if (builder.user_status == null) {
                this.user_status = DEFAULT_USER_STATUS;
            } else {
                this.user_status = builder.user_status;
            }
            if (builder.meizhi_level == null) {
                this.meizhi_level = DEFAULT_MEIZHI_LEVEL;
            } else {
                this.meizhi_level = builder.meizhi_level;
            }
            if (builder.superboy == null) {
                this.superboy = DEFAULT_SUPERBOY;
            } else {
                this.superboy = builder.superboy;
            }
            if (builder.card == null) {
                this.card = "";
            } else {
                this.card = builder.card;
            }
            this.parr_props = builder.parr_props;
            this.m_parr_props = builder.m_parr_props;
            this.wap_rn = builder.wap_rn;
            if (builder.is_tenyear == null) {
                this.is_tenyear = DEFAULT_IS_TENYEAR;
            } else {
                this.is_tenyear = builder.is_tenyear;
            }
            if (builder.is_group_owner == null) {
                this.is_group_owner = DEFAULT_IS_GROUP_OWNER;
            } else {
                this.is_group_owner = builder.is_group_owner;
            }
            this.parr_scores = builder.parr_scores;
            if (builder.user_type == null) {
                this.user_type = DEFAULT_USER_TYPE;
            } else {
                this.user_type = builder.user_type;
            }
            if (builder.use_sig == null) {
                this.use_sig = DEFAULT_USE_SIG;
            } else {
                this.use_sig = builder.use_sig;
            }
            if (builder.paper == null) {
                this.paper = "";
            } else {
                this.paper = builder.paper;
            }
            if (builder.bg_id == null) {
                this.bg_id = "";
            } else {
                this.bg_id = builder.bg_id;
            }
            if (builder.is_shengyou == null) {
                this.is_shengyou = DEFAULT_IS_SHENGYOU;
            } else {
                this.is_shengyou = builder.is_shengyou;
            }
            if (builder.is_hardworking == null) {
                this.is_hardworking = DEFAULT_IS_HARDWORKING;
            } else {
                this.is_hardworking = builder.is_hardworking;
            }
            if (builder.billboard == null) {
                this.billboard = "";
            } else {
                this.billboard = builder.billboard;
            }
            if (builder.portrait_time == null) {
                this.portrait_time = "";
            } else {
                this.portrait_time = builder.portrait_time;
            }
            if (builder.appraise == null) {
                this.appraise = DEFAULT_APPRAISE;
            } else {
                this.appraise = immutableCopyOf(builder.appraise);
            }
            if (builder.tbscore_repeate_finish_time == null) {
                this.tbscore_repeate_finish_time = "";
            } else {
                this.tbscore_repeate_finish_time = builder.tbscore_repeate_finish_time;
            }
            if (builder.is_member == null) {
                this.is_member = DEFAULT_IS_MEMBER;
            } else {
                this.is_member = builder.is_member;
            }
            if (builder.is_passer == null) {
                this.is_passer = DEFAULT_IS_PASSER;
            } else {
                this.is_passer = builder.is_passer;
            }
            if (builder.is_qun_spring == null) {
                this.is_qun_spring = DEFAULT_IS_QUN_SPRING;
            } else {
                this.is_qun_spring = builder.is_qun_spring;
            }
            if (builder.notice_mask == null) {
                this.notice_mask = DEFAULT_NOTICE_MASK;
            } else {
                this.notice_mask = immutableCopyOf(builder.notice_mask);
            }
            if (builder.rpgoldicon == null) {
                this.rpgoldicon = DEFAULT_RPGOLDICON;
            } else {
                this.rpgoldicon = immutableCopyOf(builder.rpgoldicon);
            }
            if (builder.is_doudizhu == null) {
                this.is_doudizhu = "";
            } else {
                this.is_doudizhu = builder.is_doudizhu;
            }
            if (builder.cdn_error == null) {
                this.cdn_error = "";
            } else {
                this.cdn_error = builder.cdn_error;
            }
            if (builder.tbmall_month_icon == null) {
                this.tbmall_month_icon = DEFAULT_TBMALL_MONTH_ICON;
            } else {
                this.tbmall_month_icon = immutableCopyOf(builder.tbmall_month_icon);
            }
            if (builder.is_coreuser == null) {
                this.is_coreuser = "";
            } else {
                this.is_coreuser = builder.is_coreuser;
            }
            this.game_attr = builder.game_attr;
            if (builder.is_interestman == null) {
                this.is_interestman = "";
            } else {
                this.is_interestman = builder.is_interestman;
            }
            this.global = builder.global;
            if (builder.free_flag == null) {
                this.free_flag = "";
                return;
            } else {
                this.free_flag = builder.free_flag;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.user_name = builder.user_name;
        this.user_sex = builder.user_sex;
        this.user_status = builder.user_status;
        this.meizhi_level = builder.meizhi_level;
        this.superboy = builder.superboy;
        this.card = builder.card;
        this.parr_props = builder.parr_props;
        this.m_parr_props = builder.m_parr_props;
        this.wap_rn = builder.wap_rn;
        this.is_tenyear = builder.is_tenyear;
        this.is_group_owner = builder.is_group_owner;
        this.parr_scores = builder.parr_scores;
        this.user_type = builder.user_type;
        this.use_sig = builder.use_sig;
        this.paper = builder.paper;
        this.bg_id = builder.bg_id;
        this.is_shengyou = builder.is_shengyou;
        this.is_hardworking = builder.is_hardworking;
        this.billboard = builder.billboard;
        this.portrait_time = builder.portrait_time;
        this.appraise = immutableCopyOf(builder.appraise);
        this.tbscore_repeate_finish_time = builder.tbscore_repeate_finish_time;
        this.is_member = builder.is_member;
        this.is_passer = builder.is_passer;
        this.is_qun_spring = builder.is_qun_spring;
        this.notice_mask = immutableCopyOf(builder.notice_mask);
        this.rpgoldicon = immutableCopyOf(builder.rpgoldicon);
        this.is_doudizhu = builder.is_doudizhu;
        this.cdn_error = builder.cdn_error;
        this.tbmall_month_icon = immutableCopyOf(builder.tbmall_month_icon);
        this.is_coreuser = builder.is_coreuser;
        this.game_attr = builder.game_attr;
        this.is_interestman = builder.is_interestman;
        this.global = builder.global;
        this.free_flag = builder.free_flag;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<NewUser> {
        public List<Props> appraise;
        public String bg_id;
        public String billboard;
        public String card;
        public String cdn_error;
        public String free_flag;
        public GameAttr game_attr;
        public Global global;
        public String is_coreuser;
        public String is_doudizhu;
        public Integer is_group_owner;
        public Integer is_hardworking;
        public String is_interestman;
        public Integer is_member;
        public Integer is_passer;
        public Integer is_qun_spring;
        public Integer is_shengyou;
        public Integer is_tenyear;
        public MparrProps m_parr_props;
        public Integer meizhi_level;
        public List<NoticeMask> notice_mask;
        public String paper;
        public ParrProps parr_props;
        public ParrScores parr_scores;
        public String portrait_time;
        public List<Rpgoldicon> rpgoldicon;
        public Integer superboy;
        public List<TbmallMonthIcon> tbmall_month_icon;
        public String tbscore_repeate_finish_time;
        public Integer use_sig;
        public Long user_id;
        public String user_name;
        public Integer user_sex;
        public Integer user_status;
        public Integer user_type;
        public WapRn wap_rn;

        public Builder() {
        }

        public Builder(NewUser newUser) {
            super(newUser);
            if (newUser != null) {
                this.user_id = newUser.user_id;
                this.user_name = newUser.user_name;
                this.user_sex = newUser.user_sex;
                this.user_status = newUser.user_status;
                this.meizhi_level = newUser.meizhi_level;
                this.superboy = newUser.superboy;
                this.card = newUser.card;
                this.parr_props = newUser.parr_props;
                this.m_parr_props = newUser.m_parr_props;
                this.wap_rn = newUser.wap_rn;
                this.is_tenyear = newUser.is_tenyear;
                this.is_group_owner = newUser.is_group_owner;
                this.parr_scores = newUser.parr_scores;
                this.user_type = newUser.user_type;
                this.use_sig = newUser.use_sig;
                this.paper = newUser.paper;
                this.bg_id = newUser.bg_id;
                this.is_shengyou = newUser.is_shengyou;
                this.is_hardworking = newUser.is_hardworking;
                this.billboard = newUser.billboard;
                this.portrait_time = newUser.portrait_time;
                this.appraise = NewUser.copyOf(newUser.appraise);
                this.tbscore_repeate_finish_time = newUser.tbscore_repeate_finish_time;
                this.is_member = newUser.is_member;
                this.is_passer = newUser.is_passer;
                this.is_qun_spring = newUser.is_qun_spring;
                this.notice_mask = NewUser.copyOf(newUser.notice_mask);
                this.rpgoldicon = NewUser.copyOf(newUser.rpgoldicon);
                this.is_doudizhu = newUser.is_doudizhu;
                this.cdn_error = newUser.cdn_error;
                this.tbmall_month_icon = NewUser.copyOf(newUser.tbmall_month_icon);
                this.is_coreuser = newUser.is_coreuser;
                this.game_attr = newUser.game_attr;
                this.is_interestman = newUser.is_interestman;
                this.global = newUser.global;
                this.free_flag = newUser.free_flag;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NewUser build(boolean z) {
            return new NewUser(this, z);
        }
    }
}
