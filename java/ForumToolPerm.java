package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class ForumToolPerm extends Message {
    public static final Long DEFAULT_PERM = 0L;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long perm;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ForumToolPerm> {
        public Long perm;

        public Builder() {
        }

        public Builder(ForumToolPerm forumToolPerm) {
            super(forumToolPerm);
            if (forumToolPerm == null) {
                return;
            }
            this.perm = forumToolPerm.perm;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumToolPerm build(boolean z) {
            return new ForumToolPerm(this, z);
        }
    }

    public ForumToolPerm(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.perm;
            if (l == null) {
                this.perm = DEFAULT_PERM;
                return;
            } else {
                this.perm = l;
                return;
            }
        }
        this.perm = builder.perm;
    }
}
