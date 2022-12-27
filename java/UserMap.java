package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class UserMap extends Message {
    public static final Integer DEFAULT_ID = 0;
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<UserMap> {
        public Integer id;
        public String name;
        public String url;

        public Builder() {
        }

        public Builder(UserMap userMap) {
            super(userMap);
            if (userMap == null) {
                return;
            }
            this.id = userMap.id;
            this.name = userMap.name;
            this.url = userMap.url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserMap build(boolean z) {
            return new UserMap(this, z);
        }
    }

    public UserMap(Builder builder, boolean z) {
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
            } else {
                this.name = str;
            }
            String str2 = builder.url;
            if (str2 == null) {
                this.url = "";
                return;
            } else {
                this.url = str2;
                return;
            }
        }
        this.id = builder.id;
        this.name = builder.name;
        this.url = builder.url;
    }
}
