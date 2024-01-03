package tbclient.GetForumLevelList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ForumLevelInfo extends Message {
    public static final Integer DEFAULT_ID = 0;
    public static final String DEFAULT_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ForumLevelInfo> {
        public Integer id;
        public String name;

        public Builder() {
        }

        public Builder(ForumLevelInfo forumLevelInfo) {
            super(forumLevelInfo);
            if (forumLevelInfo == null) {
                return;
            }
            this.id = forumLevelInfo.id;
            this.name = forumLevelInfo.name;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumLevelInfo build(boolean z) {
            return new ForumLevelInfo(this, z);
        }
    }

    public ForumLevelInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.id;
            if (num == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = num;
            }
            String str = builder.name;
            if (str == null) {
                this.name = "";
                return;
            } else {
                this.name = str;
                return;
            }
        }
        this.id = builder.id;
        this.name = builder.name;
    }
}
