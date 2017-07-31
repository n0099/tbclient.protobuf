package tbclient.GetAddressList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class friendList extends Message {
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_QUANPIN = "";
    public static final Long DEFAULT_USER_ID = 0L;
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 5)
    public final LbsInfo location;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String quanpin;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;

    private friendList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.portrait == null) {
                this.portrait = "";
            } else {
                this.portrait = builder.portrait;
            }
            if (builder.user_name == null) {
                this.user_name = "";
            } else {
                this.user_name = builder.user_name;
            }
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            if (builder.quanpin == null) {
                this.quanpin = "";
            } else {
                this.quanpin = builder.quanpin;
            }
            this.location = builder.location;
            return;
        }
        this.portrait = builder.portrait;
        this.user_name = builder.user_name;
        this.user_id = builder.user_id;
        this.quanpin = builder.quanpin;
        this.location = builder.location;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<friendList> {
        public LbsInfo location;
        public String portrait;
        public String quanpin;
        public Long user_id;
        public String user_name;

        public Builder() {
        }

        public Builder(friendList friendlist) {
            super(friendlist);
            if (friendlist != null) {
                this.portrait = friendlist.portrait;
                this.user_name = friendlist.user_name;
                this.user_id = friendlist.user_id;
                this.quanpin = friendlist.quanpin;
                this.location = friendlist.location;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public friendList build(boolean z) {
            return new friendList(this, z);
        }
    }
}
