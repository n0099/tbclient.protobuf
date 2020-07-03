package tbclient.ActivityPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;
import tbclient.User;
/* loaded from: classes9.dex */
public final class ResourceInfo extends Message {
    public static final String DEFAULT_HOT_TOPIC = "";
    public static final String DEFAULT_RECOMMEND_FORUM = "";
    public static final List<User> DEFAULT_RECOMMEND_USER = Collections.emptyList();
    public static final String DEFAULT_SPECIAL_COLUMN = "";
    public static final String DEFAULT_TYPE = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String hot_topic;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String recommend_forum;
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<User> recommend_user;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String special_column;
    @ProtoField(tag = 2)
    public final ThreadInfo thread;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String type;

    private ResourceInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.type == null) {
                this.type = "";
            } else {
                this.type = builder.type;
            }
            this.thread = builder.thread;
            if (builder.hot_topic == null) {
                this.hot_topic = "";
            } else {
                this.hot_topic = builder.hot_topic;
            }
            if (builder.special_column == null) {
                this.special_column = "";
            } else {
                this.special_column = builder.special_column;
            }
            if (builder.recommend_forum == null) {
                this.recommend_forum = "";
            } else {
                this.recommend_forum = builder.recommend_forum;
            }
            if (builder.recommend_user == null) {
                this.recommend_user = DEFAULT_RECOMMEND_USER;
                return;
            } else {
                this.recommend_user = immutableCopyOf(builder.recommend_user);
                return;
            }
        }
        this.type = builder.type;
        this.thread = builder.thread;
        this.hot_topic = builder.hot_topic;
        this.special_column = builder.special_column;
        this.recommend_forum = builder.recommend_forum;
        this.recommend_user = immutableCopyOf(builder.recommend_user);
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ResourceInfo> {
        public String hot_topic;
        public String recommend_forum;
        public List<User> recommend_user;
        public String special_column;
        public ThreadInfo thread;
        public String type;

        public Builder() {
        }

        public Builder(ResourceInfo resourceInfo) {
            super(resourceInfo);
            if (resourceInfo != null) {
                this.type = resourceInfo.type;
                this.thread = resourceInfo.thread;
                this.hot_topic = resourceInfo.hot_topic;
                this.special_column = resourceInfo.special_column;
                this.recommend_forum = resourceInfo.recommend_forum;
                this.recommend_user = ResourceInfo.copyOf(resourceInfo.recommend_user);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ResourceInfo build(boolean z) {
            return new ResourceInfo(this, z);
        }
    }
}
