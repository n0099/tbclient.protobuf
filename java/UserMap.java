package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
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

    private UserMap(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.id == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = builder.id;
            }
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.url == null) {
                this.url = "";
                return;
            } else {
                this.url = builder.url;
                return;
            }
        }
        this.id = builder.id;
        this.name = builder.name;
        this.url = builder.url;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<UserMap> {
        public Integer id;
        public String name;
        public String url;

        public Builder() {
        }

        public Builder(UserMap userMap) {
            super(userMap);
            if (userMap != null) {
                this.id = userMap.id;
                this.name = userMap.name;
                this.url = userMap.url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserMap build(boolean z) {
            return new UserMap(this, z);
        }
    }
}
