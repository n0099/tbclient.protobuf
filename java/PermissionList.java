package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class PermissionList extends Message {
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer chat;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer follow;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer interact;
    public static final Integer DEFAULT_FOLLOW = 0;
    public static final Integer DEFAULT_INTERACT = 0;
    public static final Integer DEFAULT_CHAT = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<PermissionList> {
        public Integer chat;
        public Integer follow;
        public Integer interact;

        public Builder() {
        }

        public Builder(PermissionList permissionList) {
            super(permissionList);
            if (permissionList == null) {
                return;
            }
            this.follow = permissionList.follow;
            this.interact = permissionList.interact;
            this.chat = permissionList.chat;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PermissionList build(boolean z) {
            return new PermissionList(this, z);
        }
    }

    public PermissionList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.follow;
            if (num == null) {
                this.follow = DEFAULT_FOLLOW;
            } else {
                this.follow = num;
            }
            Integer num2 = builder.interact;
            if (num2 == null) {
                this.interact = DEFAULT_INTERACT;
            } else {
                this.interact = num2;
            }
            Integer num3 = builder.chat;
            if (num3 == null) {
                this.chat = DEFAULT_CHAT;
                return;
            } else {
                this.chat = num3;
                return;
            }
        }
        this.follow = builder.follow;
        this.interact = builder.interact;
        this.chat = builder.chat;
    }
}
