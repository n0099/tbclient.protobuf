package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class SignForum extends Message {
    public static final String DEFAULT_LEVEL1_DIR_NAME = "";
    public static final String DEFAULT_LEVEL2_DIR_NAME = "";
    @ProtoField(tag = 4)
    public final RankInfo current_rank_info;
    @ProtoField(tag = 10, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 3)
    public final Forum forum_info;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_filter;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_on;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String level1_dir_name;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String level2_dir_name;
    @ProtoField(tag = 9)
    public final RankInfo monthly_rank_info;
    @ProtoField(tag = 6)
    public final RankInfo weekly_rank_info;
    @ProtoField(tag = 5)
    public final RankInfo yesterday_rank_info;
    public static final Integer DEFAULT_IS_ON = 0;
    public static final Integer DEFAULT_IS_FILTER = 0;
    public static final Long DEFAULT_FORUM_ID = 0L;

    /* synthetic */ SignForum(Builder builder, boolean z, SignForum signForum) {
        this(builder, z);
    }

    private SignForum(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.is_on == null) {
                this.is_on = DEFAULT_IS_ON;
            } else {
                this.is_on = builder.is_on;
            }
            if (builder.is_filter == null) {
                this.is_filter = DEFAULT_IS_FILTER;
            } else {
                this.is_filter = builder.is_filter;
            }
            this.forum_info = builder.forum_info;
            this.current_rank_info = builder.current_rank_info;
            this.yesterday_rank_info = builder.yesterday_rank_info;
            this.weekly_rank_info = builder.weekly_rank_info;
            if (builder.level1_dir_name == null) {
                this.level1_dir_name = "";
            } else {
                this.level1_dir_name = builder.level1_dir_name;
            }
            if (builder.level2_dir_name == null) {
                this.level2_dir_name = "";
            } else {
                this.level2_dir_name = builder.level2_dir_name;
            }
            this.monthly_rank_info = builder.monthly_rank_info;
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
                return;
            } else {
                this.forum_id = builder.forum_id;
                return;
            }
        }
        this.is_on = builder.is_on;
        this.is_filter = builder.is_filter;
        this.forum_info = builder.forum_info;
        this.current_rank_info = builder.current_rank_info;
        this.yesterday_rank_info = builder.yesterday_rank_info;
        this.weekly_rank_info = builder.weekly_rank_info;
        this.level1_dir_name = builder.level1_dir_name;
        this.level2_dir_name = builder.level2_dir_name;
        this.monthly_rank_info = builder.monthly_rank_info;
        this.forum_id = builder.forum_id;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<SignForum> {
        public RankInfo current_rank_info;
        public Long forum_id;
        public Forum forum_info;
        public Integer is_filter;
        public Integer is_on;
        public String level1_dir_name;
        public String level2_dir_name;
        public RankInfo monthly_rank_info;
        public RankInfo weekly_rank_info;
        public RankInfo yesterday_rank_info;

        public Builder() {
        }

        public Builder(SignForum signForum) {
            super(signForum);
            if (signForum != null) {
                this.is_on = signForum.is_on;
                this.is_filter = signForum.is_filter;
                this.forum_info = signForum.forum_info;
                this.current_rank_info = signForum.current_rank_info;
                this.yesterday_rank_info = signForum.yesterday_rank_info;
                this.weekly_rank_info = signForum.weekly_rank_info;
                this.level1_dir_name = signForum.level1_dir_name;
                this.level2_dir_name = signForum.level2_dir_name;
                this.monthly_rank_info = signForum.monthly_rank_info;
                this.forum_id = signForum.forum_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SignForum build(boolean z) {
            return new SignForum(this, z, null);
        }
    }
}
