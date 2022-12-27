package tbclient.AddFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class ResData extends Message {
    public static final Long DEFAULT_FRIEND_ID = 0L;
    public static final String DEFAULT_MESSAGE = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long friend_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String message;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ResData> {
        public Long friend_id;
        public String message;

        public Builder() {
        }

        public Builder(ResData resData) {
            super(resData);
            if (resData == null) {
                return;
            }
            this.friend_id = resData.friend_id;
            this.message = resData.message;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ResData build(boolean z) {
            return new ResData(this, z);
        }
    }

    public ResData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.friend_id;
            if (l == null) {
                this.friend_id = DEFAULT_FRIEND_ID;
            } else {
                this.friend_id = l;
            }
            String str = builder.message;
            if (str == null) {
                this.message = "";
                return;
            } else {
                this.message = str;
                return;
            }
        }
        this.friend_id = builder.friend_id;
        this.message = builder.message;
    }
}
