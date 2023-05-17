package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class ForumGroup extends Message {
    @ProtoField(tag = 2)
    public final GroupFeedCard feed_card;
    @ProtoField(tag = 1)
    public final TopbarEntrance topbar_entrance;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<ForumGroup> {
        public GroupFeedCard feed_card;
        public TopbarEntrance topbar_entrance;

        public Builder() {
        }

        public Builder(ForumGroup forumGroup) {
            super(forumGroup);
            if (forumGroup == null) {
                return;
            }
            this.topbar_entrance = forumGroup.topbar_entrance;
            this.feed_card = forumGroup.feed_card;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumGroup build(boolean z) {
            return new ForumGroup(this, z);
        }
    }

    public ForumGroup(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.topbar_entrance = builder.topbar_entrance;
            this.feed_card = builder.feed_card;
            return;
        }
        this.topbar_entrance = builder.topbar_entrance;
        this.feed_card = builder.feed_card;
    }
}
