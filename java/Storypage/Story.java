package tbclient.Storypage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;
import tbclient.User;
/* loaded from: classes9.dex */
public final class Story extends Message {
    public static final List<ThreadInfo> DEFAULT_STORY_LIST = Collections.emptyList();
    public static final Integer DEFAULT_STORY_USER_TYPE = 0;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadInfo> story_list;
    @ProtoField(tag = 2)
    public final User story_user;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer story_user_type;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Story> {
        public List<ThreadInfo> story_list;
        public User story_user;
        public Integer story_user_type;

        public Builder() {
        }

        public Builder(Story story) {
            super(story);
            if (story == null) {
                return;
            }
            this.story_list = Message.copyOf(story.story_list);
            this.story_user = story.story_user;
            this.story_user_type = story.story_user_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Story build(boolean z) {
            return new Story(this, z);
        }
    }

    public Story(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<ThreadInfo> list = builder.story_list;
            if (list == null) {
                this.story_list = DEFAULT_STORY_LIST;
            } else {
                this.story_list = Message.immutableCopyOf(list);
            }
            this.story_user = builder.story_user;
            Integer num = builder.story_user_type;
            if (num == null) {
                this.story_user_type = DEFAULT_STORY_USER_TYPE;
                return;
            } else {
                this.story_user_type = num;
                return;
            }
        }
        this.story_list = Message.immutableCopyOf(builder.story_list);
        this.story_user = builder.story_user;
        this.story_user_type = builder.story_user_type;
    }
}
