package tbclient.GetAddressList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class friendList extends Message {
    public static final String DEFAULT_NAME_SHOW = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_QUANPIN = "";
    public static final Long DEFAULT_USER_ID = 0L;
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 5)
    public final LbsInfo location;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String name_show;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String quanpin;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<friendList> {
        public LbsInfo location;
        public String name_show;
        public String portrait;
        public String quanpin;
        public Long user_id;
        public String user_name;

        public Builder() {
        }

        public Builder(friendList friendlist) {
            super(friendlist);
            if (friendlist == null) {
                return;
            }
            this.portrait = friendlist.portrait;
            this.user_name = friendlist.user_name;
            this.user_id = friendlist.user_id;
            this.quanpin = friendlist.quanpin;
            this.location = friendlist.location;
            this.name_show = friendlist.name_show;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public friendList build(boolean z) {
            return new friendList(this, z);
        }
    }

    public friendList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.portrait;
            if (str == null) {
                this.portrait = "";
            } else {
                this.portrait = str;
            }
            String str2 = builder.user_name;
            if (str2 == null) {
                this.user_name = "";
            } else {
                this.user_name = str2;
            }
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l;
            }
            String str3 = builder.quanpin;
            if (str3 == null) {
                this.quanpin = "";
            } else {
                this.quanpin = str3;
            }
            this.location = builder.location;
            String str4 = builder.name_show;
            if (str4 == null) {
                this.name_show = "";
                return;
            } else {
                this.name_show = str4;
                return;
            }
        }
        this.portrait = builder.portrait;
        this.user_name = builder.user_name;
        this.user_id = builder.user_id;
        this.quanpin = builder.quanpin;
        this.location = builder.location;
        this.name_show = builder.name_show;
    }
}
