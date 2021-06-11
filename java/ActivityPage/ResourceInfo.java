package tbclient.ActivityPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;
import tbclient.User;
/* loaded from: classes8.dex */
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

    /* loaded from: classes8.dex */
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
            if (resourceInfo == null) {
                return;
            }
            this.type = resourceInfo.type;
            this.thread = resourceInfo.thread;
            this.hot_topic = resourceInfo.hot_topic;
            this.special_column = resourceInfo.special_column;
            this.recommend_forum = resourceInfo.recommend_forum;
            this.recommend_user = Message.copyOf(resourceInfo.recommend_user);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ResourceInfo build(boolean z) {
            return new ResourceInfo(this, z);
        }
    }

    public ResourceInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.type;
            if (str == null) {
                this.type = "";
            } else {
                this.type = str;
            }
            this.thread = builder.thread;
            String str2 = builder.hot_topic;
            if (str2 == null) {
                this.hot_topic = "";
            } else {
                this.hot_topic = str2;
            }
            String str3 = builder.special_column;
            if (str3 == null) {
                this.special_column = "";
            } else {
                this.special_column = str3;
            }
            String str4 = builder.recommend_forum;
            if (str4 == null) {
                this.recommend_forum = "";
            } else {
                this.recommend_forum = str4;
            }
            List<User> list = builder.recommend_user;
            if (list == null) {
                this.recommend_user = DEFAULT_RECOMMEND_USER;
                return;
            } else {
                this.recommend_user = Message.immutableCopyOf(list);
                return;
            }
        }
        this.type = builder.type;
        this.thread = builder.thread;
        this.hot_topic = builder.hot_topic;
        this.special_column = builder.special_column;
        this.recommend_forum = builder.recommend_forum;
        this.recommend_user = Message.immutableCopyOf(builder.recommend_user);
    }
}
