package tbclient.UserBlackPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.PermissionList;
/* loaded from: classes9.dex */
public final class UserPermList extends Message {
    public static final String DEFAULT_NAME_SHOW = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final Long DEFAULT_UID = 0L;
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String name_show;
    @ProtoField(tag = 2)
    public final PermissionList perm_list;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long uid;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String user_name;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<UserPermList> {
        public String name_show;
        public PermissionList perm_list;
        public String portrait;
        public Long uid;
        public String user_name;

        public Builder() {
        }

        public Builder(UserPermList userPermList) {
            super(userPermList);
            if (userPermList == null) {
                return;
            }
            this.uid = userPermList.uid;
            this.perm_list = userPermList.perm_list;
            this.user_name = userPermList.user_name;
            this.name_show = userPermList.name_show;
            this.portrait = userPermList.portrait;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserPermList build(boolean z) {
            return new UserPermList(this, z);
        }
    }

    public UserPermList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.uid;
            if (l == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = l;
            }
            this.perm_list = builder.perm_list;
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            String str2 = builder.name_show;
            if (str2 == null) {
                this.name_show = "";
            } else {
                this.name_show = str2;
            }
            String str3 = builder.portrait;
            if (str3 == null) {
                this.portrait = "";
                return;
            } else {
                this.portrait = str3;
                return;
            }
        }
        this.uid = builder.uid;
        this.perm_list = builder.perm_list;
        this.user_name = builder.user_name;
        this.name_show = builder.name_show;
        this.portrait = builder.portrait;
    }
}
