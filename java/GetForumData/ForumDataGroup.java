package tbclient.GetForumData;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class ForumDataGroup extends Message {
    public static final Double DEFAULT_TOTAL = Double.valueOf(0.0d);
    public static final List<ForumDataValue> DEFAULT_VALUES = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.DOUBLE)
    public final Double total;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ForumDataValue> values;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ForumDataGroup> {
        public Double total;
        public List<ForumDataValue> values;

        public Builder() {
        }

        public Builder(ForumDataGroup forumDataGroup) {
            super(forumDataGroup);
            if (forumDataGroup == null) {
                return;
            }
            this.total = forumDataGroup.total;
            this.values = Message.copyOf(forumDataGroup.values);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumDataGroup build(boolean z) {
            return new ForumDataGroup(this, z);
        }
    }

    public ForumDataGroup(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Double d = builder.total;
            if (d == null) {
                this.total = DEFAULT_TOTAL;
            } else {
                this.total = d;
            }
            List<ForumDataValue> list = builder.values;
            if (list == null) {
                this.values = DEFAULT_VALUES;
                return;
            } else {
                this.values = Message.immutableCopyOf(list);
                return;
            }
        }
        this.total = builder.total;
        this.values = Message.immutableCopyOf(builder.values);
    }
}
