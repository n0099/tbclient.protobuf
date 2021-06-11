package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes8.dex */
public final class MemberGroupInfo extends Message {
    public static final String DEFAULT_MEMBER_GROUP_TYPE = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<BawuRoleInfoPub> member_group_list;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer member_group_num;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String member_group_type;
    public static final Integer DEFAULT_MEMBER_GROUP_NUM = 0;
    public static final List<BawuRoleInfoPub> DEFAULT_MEMBER_GROUP_LIST = Collections.emptyList();

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<MemberGroupInfo> {
        public List<BawuRoleInfoPub> member_group_list;
        public Integer member_group_num;
        public String member_group_type;

        public Builder() {
        }

        public Builder(MemberGroupInfo memberGroupInfo) {
            super(memberGroupInfo);
            if (memberGroupInfo == null) {
                return;
            }
            this.member_group_type = memberGroupInfo.member_group_type;
            this.member_group_num = memberGroupInfo.member_group_num;
            this.member_group_list = Message.copyOf(memberGroupInfo.member_group_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MemberGroupInfo build(boolean z) {
            return new MemberGroupInfo(this, z);
        }
    }

    public MemberGroupInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.member_group_type;
            if (str == null) {
                this.member_group_type = "";
            } else {
                this.member_group_type = str;
            }
            Integer num = builder.member_group_num;
            if (num == null) {
                this.member_group_num = DEFAULT_MEMBER_GROUP_NUM;
            } else {
                this.member_group_num = num;
            }
            List<BawuRoleInfoPub> list = builder.member_group_list;
            if (list == null) {
                this.member_group_list = DEFAULT_MEMBER_GROUP_LIST;
                return;
            } else {
                this.member_group_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.member_group_type = builder.member_group_type;
        this.member_group_num = builder.member_group_num;
        this.member_group_list = Message.immutableCopyOf(builder.member_group_list);
    }
}
