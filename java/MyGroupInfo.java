package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class MyGroupInfo extends Message {
    public static final String DEFAULT_GROUP_NAME = "";
    public static final String DEFAULT_PORTRAIT = "";
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long group_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String group_name;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer max_member_num;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer member_num;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String portrait;
    public static final Long DEFAULT_GROUP_ID = 0L;
    public static final Integer DEFAULT_MEMBER_NUM = 0;
    public static final Integer DEFAULT_MAX_MEMBER_NUM = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<MyGroupInfo> {
        public Long group_id;
        public String group_name;
        public Integer max_member_num;
        public Integer member_num;
        public String portrait;

        public Builder() {
        }

        public Builder(MyGroupInfo myGroupInfo) {
            super(myGroupInfo);
            if (myGroupInfo == null) {
                return;
            }
            this.group_id = myGroupInfo.group_id;
            this.group_name = myGroupInfo.group_name;
            this.portrait = myGroupInfo.portrait;
            this.member_num = myGroupInfo.member_num;
            this.max_member_num = myGroupInfo.max_member_num;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MyGroupInfo build(boolean z) {
            return new MyGroupInfo(this, z);
        }
    }

    public MyGroupInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.group_id;
            if (l == null) {
                this.group_id = DEFAULT_GROUP_ID;
            } else {
                this.group_id = l;
            }
            String str = builder.group_name;
            if (str == null) {
                this.group_name = "";
            } else {
                this.group_name = str;
            }
            String str2 = builder.portrait;
            if (str2 == null) {
                this.portrait = "";
            } else {
                this.portrait = str2;
            }
            Integer num = builder.member_num;
            if (num == null) {
                this.member_num = DEFAULT_MEMBER_NUM;
            } else {
                this.member_num = num;
            }
            Integer num2 = builder.max_member_num;
            if (num2 == null) {
                this.max_member_num = DEFAULT_MAX_MEMBER_NUM;
                return;
            } else {
                this.max_member_num = num2;
                return;
            }
        }
        this.group_id = builder.group_id;
        this.group_name = builder.group_name;
        this.portrait = builder.portrait;
        this.member_num = builder.member_num;
        this.max_member_num = builder.max_member_num;
    }
}
