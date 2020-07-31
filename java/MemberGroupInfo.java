package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes16.dex */
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

    private MemberGroupInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.member_group_type == null) {
                this.member_group_type = "";
            } else {
                this.member_group_type = builder.member_group_type;
            }
            if (builder.member_group_num == null) {
                this.member_group_num = DEFAULT_MEMBER_GROUP_NUM;
            } else {
                this.member_group_num = builder.member_group_num;
            }
            if (builder.member_group_list == null) {
                this.member_group_list = DEFAULT_MEMBER_GROUP_LIST;
                return;
            } else {
                this.member_group_list = immutableCopyOf(builder.member_group_list);
                return;
            }
        }
        this.member_group_type = builder.member_group_type;
        this.member_group_num = builder.member_group_num;
        this.member_group_list = immutableCopyOf(builder.member_group_list);
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<MemberGroupInfo> {
        public List<BawuRoleInfoPub> member_group_list;
        public Integer member_group_num;
        public String member_group_type;

        public Builder() {
        }

        public Builder(MemberGroupInfo memberGroupInfo) {
            super(memberGroupInfo);
            if (memberGroupInfo != null) {
                this.member_group_type = memberGroupInfo.member_group_type;
                this.member_group_num = memberGroupInfo.member_group_num;
                this.member_group_list = MemberGroupInfo.copyOf(memberGroupInfo.member_group_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MemberGroupInfo build(boolean z) {
            return new MemberGroupInfo(this, z);
        }
    }
}
