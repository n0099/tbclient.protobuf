package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class BaijiahaoInfo extends Message {
    public static final String DEFAULT_AUTH_DESC = "";
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_AVATAR_H = "";
    public static final String DEFAULT_BRIEF = "";
    public static final String DEFAULT_NAME = "";
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String auth_desc;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer auth_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String avatar_h;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String brief;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer can_modify_avatar;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;
    public static final Integer DEFAULT_AUTH_ID = 0;
    public static final Integer DEFAULT_CAN_MODIFY_AVATAR = 0;

    private BaijiahaoInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.avatar == null) {
                this.avatar = "";
            } else {
                this.avatar = builder.avatar;
            }
            if (builder.avatar_h == null) {
                this.avatar_h = "";
            } else {
                this.avatar_h = builder.avatar_h;
            }
            if (builder.brief == null) {
                this.brief = "";
            } else {
                this.brief = builder.brief;
            }
            if (builder.auth_id == null) {
                this.auth_id = DEFAULT_AUTH_ID;
            } else {
                this.auth_id = builder.auth_id;
            }
            if (builder.auth_desc == null) {
                this.auth_desc = "";
            } else {
                this.auth_desc = builder.auth_desc;
            }
            if (builder.can_modify_avatar == null) {
                this.can_modify_avatar = DEFAULT_CAN_MODIFY_AVATAR;
                return;
            } else {
                this.can_modify_avatar = builder.can_modify_avatar;
                return;
            }
        }
        this.name = builder.name;
        this.avatar = builder.avatar;
        this.avatar_h = builder.avatar_h;
        this.brief = builder.brief;
        this.auth_id = builder.auth_id;
        this.auth_desc = builder.auth_desc;
        this.can_modify_avatar = builder.can_modify_avatar;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<BaijiahaoInfo> {
        public String auth_desc;
        public Integer auth_id;
        public String avatar;
        public String avatar_h;
        public String brief;
        public Integer can_modify_avatar;
        public String name;

        public Builder() {
        }

        public Builder(BaijiahaoInfo baijiahaoInfo) {
            super(baijiahaoInfo);
            if (baijiahaoInfo != null) {
                this.name = baijiahaoInfo.name;
                this.avatar = baijiahaoInfo.avatar;
                this.avatar_h = baijiahaoInfo.avatar_h;
                this.brief = baijiahaoInfo.brief;
                this.auth_id = baijiahaoInfo.auth_id;
                this.auth_desc = baijiahaoInfo.auth_desc;
                this.can_modify_avatar = baijiahaoInfo.can_modify_avatar;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BaijiahaoInfo build(boolean z) {
            return new BaijiahaoInfo(this, z);
        }
    }
}
