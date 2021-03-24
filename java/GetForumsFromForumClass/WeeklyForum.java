package tbclient.GetForumsFromForumClass;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class WeeklyForum extends Message {
    public static final Integer DEFAULT_HOT_RANK = 0;
    @ProtoField(tag = 1)
    public final ForumSpaceForumInfo forum_info;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer hot_rank;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<WeeklyForum> {
        public ForumSpaceForumInfo forum_info;
        public Integer hot_rank;

        public Builder() {
        }

        public Builder(WeeklyForum weeklyForum) {
            super(weeklyForum);
            if (weeklyForum == null) {
                return;
            }
            this.forum_info = weeklyForum.forum_info;
            this.hot_rank = weeklyForum.hot_rank;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public WeeklyForum build(boolean z) {
            return new WeeklyForum(this, z);
        }
    }

    public WeeklyForum(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.forum_info = builder.forum_info;
            Integer num = builder.hot_rank;
            if (num == null) {
                this.hot_rank = DEFAULT_HOT_RANK;
                return;
            } else {
                this.hot_rank = num;
                return;
            }
        }
        this.forum_info = builder.forum_info;
        this.hot_rank = builder.hot_rank;
    }
}
