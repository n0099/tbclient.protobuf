package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class UserPics extends Message {
    public static final String DEFAULT_BIG = "";
    public static final String DEFAULT_SMALL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String big;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String small;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<UserPics> {
        public String big;
        public String small;

        public Builder() {
        }

        public Builder(UserPics userPics) {
            super(userPics);
            if (userPics == null) {
                return;
            }
            this.big = userPics.big;
            this.small = userPics.small;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserPics build(boolean z) {
            return new UserPics(this, z);
        }
    }

    public UserPics(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.big;
            if (str == null) {
                this.big = "";
            } else {
                this.big = str;
            }
            String str2 = builder.small;
            if (str2 == null) {
                this.small = "";
                return;
            } else {
                this.small = str2;
                return;
            }
        }
        this.big = builder.big;
        this.small = builder.small;
    }
}
