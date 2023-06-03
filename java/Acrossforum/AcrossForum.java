package tbclient.Acrossforum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class AcrossForum extends Message {
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_FORUM_NAME = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String forum_name;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<AcrossForum> {
        public String desc;
        public String forum_name;

        public Builder() {
        }

        public Builder(AcrossForum acrossForum) {
            super(acrossForum);
            if (acrossForum == null) {
                return;
            }
            this.forum_name = acrossForum.forum_name;
            this.desc = acrossForum.desc;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AcrossForum build(boolean z) {
            return new AcrossForum(this, z);
        }
    }

    public AcrossForum(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.forum_name;
            if (str == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str;
            }
            String str2 = builder.desc;
            if (str2 == null) {
                this.desc = "";
                return;
            } else {
                this.desc = str2;
                return;
            }
        }
        this.forum_name = builder.forum_name;
        this.desc = builder.desc;
    }
}
