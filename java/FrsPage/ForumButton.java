package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ForumButton extends Message {
    public static final Integer DEFAULT_IS_BLUEV = 0;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_blueV;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ForumButton> {
        public Integer is_blueV;

        public Builder() {
        }

        public Builder(ForumButton forumButton) {
            super(forumButton);
            if (forumButton == null) {
                return;
            }
            this.is_blueV = forumButton.is_blueV;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumButton build(boolean z) {
            return new ForumButton(this, z);
        }
    }

    public ForumButton(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.is_blueV;
            if (num == null) {
                this.is_blueV = DEFAULT_IS_BLUEV;
                return;
            } else {
                this.is_blueV = num;
                return;
            }
        }
        this.is_blueV = builder.is_blueV;
    }
}
