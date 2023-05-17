package tbclient.GetForumDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class ForumDataCenter extends Message {
    public static final Integer DEFAULT_HOMEPAGE_THREAD_CNT;
    public static final Integer DEFAULT_HOMEPAGE_THREAD_CNT_DIFF;
    public static final Double DEFAULT_USER_DURATION_AVG_DIFF;
    public static final Double DEFAULT_USER_SIGN_RATE;
    public static final Double DEFAULT_USER_SIGN_RATE_DIFF;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer homepage_thread_cnt;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer homepage_thread_cnt_diff;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer new_follow_cnt;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer new_follow_cnt_diff;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer new_pv_cnt;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer new_pv_cnt_diff;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer new_thread_cnt;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer new_thread_cnt_diff;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer user_duration_avg;
    @ProtoField(tag = 8, type = Message.Datatype.DOUBLE)
    public final Double user_duration_avg_diff;
    @ProtoField(tag = 9, type = Message.Datatype.DOUBLE)
    public final Double user_sign_rate;
    @ProtoField(tag = 10, type = Message.Datatype.DOUBLE)
    public final Double user_sign_rate_diff;
    public static final Integer DEFAULT_NEW_PV_CNT = 0;
    public static final Integer DEFAULT_NEW_PV_CNT_DIFF = 0;
    public static final Integer DEFAULT_NEW_THREAD_CNT = 0;
    public static final Integer DEFAULT_NEW_THREAD_CNT_DIFF = 0;
    public static final Integer DEFAULT_NEW_FOLLOW_CNT = 0;
    public static final Integer DEFAULT_NEW_FOLLOW_CNT_DIFF = 0;
    public static final Integer DEFAULT_USER_DURATION_AVG = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<ForumDataCenter> {
        public Integer homepage_thread_cnt;
        public Integer homepage_thread_cnt_diff;
        public Integer new_follow_cnt;
        public Integer new_follow_cnt_diff;
        public Integer new_pv_cnt;
        public Integer new_pv_cnt_diff;
        public Integer new_thread_cnt;
        public Integer new_thread_cnt_diff;
        public Integer user_duration_avg;
        public Double user_duration_avg_diff;
        public Double user_sign_rate;
        public Double user_sign_rate_diff;

        public Builder() {
        }

        public Builder(ForumDataCenter forumDataCenter) {
            super(forumDataCenter);
            if (forumDataCenter == null) {
                return;
            }
            this.new_pv_cnt = forumDataCenter.new_pv_cnt;
            this.new_pv_cnt_diff = forumDataCenter.new_pv_cnt_diff;
            this.new_thread_cnt = forumDataCenter.new_thread_cnt;
            this.new_thread_cnt_diff = forumDataCenter.new_thread_cnt_diff;
            this.new_follow_cnt = forumDataCenter.new_follow_cnt;
            this.new_follow_cnt_diff = forumDataCenter.new_follow_cnt_diff;
            this.user_duration_avg = forumDataCenter.user_duration_avg;
            this.user_duration_avg_diff = forumDataCenter.user_duration_avg_diff;
            this.user_sign_rate = forumDataCenter.user_sign_rate;
            this.user_sign_rate_diff = forumDataCenter.user_sign_rate_diff;
            this.homepage_thread_cnt = forumDataCenter.homepage_thread_cnt;
            this.homepage_thread_cnt_diff = forumDataCenter.homepage_thread_cnt_diff;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumDataCenter build(boolean z) {
            return new ForumDataCenter(this, z);
        }
    }

    static {
        Double valueOf = Double.valueOf(0.0d);
        DEFAULT_USER_DURATION_AVG_DIFF = valueOf;
        DEFAULT_USER_SIGN_RATE = valueOf;
        DEFAULT_USER_SIGN_RATE_DIFF = valueOf;
        DEFAULT_HOMEPAGE_THREAD_CNT = 0;
        DEFAULT_HOMEPAGE_THREAD_CNT_DIFF = 0;
    }

    public ForumDataCenter(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.new_pv_cnt;
            if (num == null) {
                this.new_pv_cnt = DEFAULT_NEW_PV_CNT;
            } else {
                this.new_pv_cnt = num;
            }
            Integer num2 = builder.new_pv_cnt_diff;
            if (num2 == null) {
                this.new_pv_cnt_diff = DEFAULT_NEW_PV_CNT_DIFF;
            } else {
                this.new_pv_cnt_diff = num2;
            }
            Integer num3 = builder.new_thread_cnt;
            if (num3 == null) {
                this.new_thread_cnt = DEFAULT_NEW_THREAD_CNT;
            } else {
                this.new_thread_cnt = num3;
            }
            Integer num4 = builder.new_thread_cnt_diff;
            if (num4 == null) {
                this.new_thread_cnt_diff = DEFAULT_NEW_THREAD_CNT_DIFF;
            } else {
                this.new_thread_cnt_diff = num4;
            }
            Integer num5 = builder.new_follow_cnt;
            if (num5 == null) {
                this.new_follow_cnt = DEFAULT_NEW_FOLLOW_CNT;
            } else {
                this.new_follow_cnt = num5;
            }
            Integer num6 = builder.new_follow_cnt_diff;
            if (num6 == null) {
                this.new_follow_cnt_diff = DEFAULT_NEW_FOLLOW_CNT_DIFF;
            } else {
                this.new_follow_cnt_diff = num6;
            }
            Integer num7 = builder.user_duration_avg;
            if (num7 == null) {
                this.user_duration_avg = DEFAULT_USER_DURATION_AVG;
            } else {
                this.user_duration_avg = num7;
            }
            Double d = builder.user_duration_avg_diff;
            if (d == null) {
                this.user_duration_avg_diff = DEFAULT_USER_DURATION_AVG_DIFF;
            } else {
                this.user_duration_avg_diff = d;
            }
            Double d2 = builder.user_sign_rate;
            if (d2 == null) {
                this.user_sign_rate = DEFAULT_USER_SIGN_RATE;
            } else {
                this.user_sign_rate = d2;
            }
            Double d3 = builder.user_sign_rate_diff;
            if (d3 == null) {
                this.user_sign_rate_diff = DEFAULT_USER_SIGN_RATE_DIFF;
            } else {
                this.user_sign_rate_diff = d3;
            }
            Integer num8 = builder.homepage_thread_cnt;
            if (num8 == null) {
                this.homepage_thread_cnt = DEFAULT_HOMEPAGE_THREAD_CNT;
            } else {
                this.homepage_thread_cnt = num8;
            }
            Integer num9 = builder.homepage_thread_cnt_diff;
            if (num9 == null) {
                this.homepage_thread_cnt_diff = DEFAULT_HOMEPAGE_THREAD_CNT_DIFF;
                return;
            } else {
                this.homepage_thread_cnt_diff = num9;
                return;
            }
        }
        this.new_pv_cnt = builder.new_pv_cnt;
        this.new_pv_cnt_diff = builder.new_pv_cnt_diff;
        this.new_thread_cnt = builder.new_thread_cnt;
        this.new_thread_cnt_diff = builder.new_thread_cnt_diff;
        this.new_follow_cnt = builder.new_follow_cnt;
        this.new_follow_cnt_diff = builder.new_follow_cnt_diff;
        this.user_duration_avg = builder.user_duration_avg;
        this.user_duration_avg_diff = builder.user_duration_avg_diff;
        this.user_sign_rate = builder.user_sign_rate;
        this.user_sign_rate_diff = builder.user_sign_rate_diff;
        this.homepage_thread_cnt = builder.homepage_thread_cnt;
        this.homepage_thread_cnt_diff = builder.homepage_thread_cnt_diff;
    }
}
