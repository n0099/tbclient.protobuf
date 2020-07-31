package tbclient.GetForumsFromForumClass;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes17.dex */
public final class WeeklyForum extends Message {
    public static final Integer DEFAULT_HOT_RANK = 0;
    @ProtoField(tag = 1)
    public final ForumSpaceForumInfo forum_info;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer hot_rank;

    private WeeklyForum(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.forum_info = builder.forum_info;
            if (builder.hot_rank == null) {
                this.hot_rank = DEFAULT_HOT_RANK;
                return;
            } else {
                this.hot_rank = builder.hot_rank;
                return;
            }
        }
        this.forum_info = builder.forum_info;
        this.hot_rank = builder.hot_rank;
    }

    /* loaded from: classes17.dex */
    public static final class Builder extends Message.Builder<WeeklyForum> {
        public ForumSpaceForumInfo forum_info;
        public Integer hot_rank;

        public Builder() {
        }

        public Builder(WeeklyForum weeklyForum) {
            super(weeklyForum);
            if (weeklyForum != null) {
                this.forum_info = weeklyForum.forum_info;
                this.hot_rank = weeklyForum.hot_rank;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public WeeklyForum build(boolean z) {
            return new WeeklyForum(this, z);
        }
    }
}
