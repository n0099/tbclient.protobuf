package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class CommonFriend extends Message {
    public static final String DEFAULT_FRIENDNAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String friendname;

    /* synthetic */ CommonFriend(Builder builder, boolean z, CommonFriend commonFriend) {
        this(builder, z);
    }

    private CommonFriend(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.friendname == null) {
                this.friendname = "";
                return;
            } else {
                this.friendname = builder.friendname;
                return;
            }
        }
        this.friendname = builder.friendname;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<CommonFriend> {
        public String friendname;

        public Builder(CommonFriend commonFriend) {
            super(commonFriend);
            if (commonFriend != null) {
                this.friendname = commonFriend.friendname;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CommonFriend build(boolean z) {
            return new CommonFriend(this, z, null);
        }
    }
}
