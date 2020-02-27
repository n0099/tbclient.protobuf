package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
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

    private MyGroupInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.group_id == null) {
                this.group_id = DEFAULT_GROUP_ID;
            } else {
                this.group_id = builder.group_id;
            }
            if (builder.group_name == null) {
                this.group_name = "";
            } else {
                this.group_name = builder.group_name;
            }
            if (builder.portrait == null) {
                this.portrait = "";
            } else {
                this.portrait = builder.portrait;
            }
            if (builder.member_num == null) {
                this.member_num = DEFAULT_MEMBER_NUM;
            } else {
                this.member_num = builder.member_num;
            }
            if (builder.max_member_num == null) {
                this.max_member_num = DEFAULT_MAX_MEMBER_NUM;
                return;
            } else {
                this.max_member_num = builder.max_member_num;
                return;
            }
        }
        this.group_id = builder.group_id;
        this.group_name = builder.group_name;
        this.portrait = builder.portrait;
        this.member_num = builder.member_num;
        this.max_member_num = builder.max_member_num;
    }

    /* loaded from: classes9.dex */
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
            if (myGroupInfo != null) {
                this.group_id = myGroupInfo.group_id;
                this.group_name = myGroupInfo.group_name;
                this.portrait = myGroupInfo.portrait;
                this.member_num = myGroupInfo.member_num;
                this.max_member_num = myGroupInfo.max_member_num;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MyGroupInfo build(boolean z) {
            return new MyGroupInfo(this, z);
        }
    }
}
