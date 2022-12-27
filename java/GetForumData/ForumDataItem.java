package tbclient.GetForumData;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class ForumDataItem extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ForumDataGroup> group;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer type;
    public static final Integer DEFAULT_TYPE = 0;
    public static final List<ForumDataGroup> DEFAULT_GROUP = Collections.emptyList();

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ForumDataItem> {
        public List<ForumDataGroup> group;
        public Integer type;

        public Builder() {
        }

        public Builder(ForumDataItem forumDataItem) {
            super(forumDataItem);
            if (forumDataItem == null) {
                return;
            }
            this.type = forumDataItem.type;
            this.group = Message.copyOf(forumDataItem.group);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumDataItem build(boolean z) {
            return new ForumDataItem(this, z);
        }
    }

    public ForumDataItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            List<ForumDataGroup> list = builder.group;
            if (list == null) {
                this.group = DEFAULT_GROUP;
                return;
            } else {
                this.group = Message.immutableCopyOf(list);
                return;
            }
        }
        this.type = builder.type;
        this.group = Message.immutableCopyOf(builder.group);
    }
}
