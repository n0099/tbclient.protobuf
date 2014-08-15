package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class TAInfo extends Message {
    @ProtoField(tag = 4)
    public final CommonDistance distanceinfo;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<CommonForum> foruminfo;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<CommonFriend> friendinfo;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer friendnum;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<CommonGroup> groupinfo;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer groupnum;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer is_friend;
    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<ReplyList> reply_list;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer userClientVersionIsLower;
    public static final List<CommonForum> DEFAULT_FORUMINFO = Collections.emptyList();
    public static final List<CommonGroup> DEFAULT_GROUPINFO = Collections.emptyList();
    public static final List<CommonFriend> DEFAULT_FRIENDINFO = Collections.emptyList();
    public static final Integer DEFAULT_GROUPNUM = 0;
    public static final Integer DEFAULT_FRIENDNUM = 0;
    public static final Integer DEFAULT_IS_FRIEND = 0;
    public static final List<ReplyList> DEFAULT_REPLY_LIST = Collections.emptyList();
    public static final Integer DEFAULT_USERCLIENTVERSIONISLOWER = 0;

    /* synthetic */ TAInfo(Builder builder, boolean z, TAInfo tAInfo) {
        this(builder, z);
    }

    private TAInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.foruminfo == null) {
                this.foruminfo = DEFAULT_FORUMINFO;
            } else {
                this.foruminfo = immutableCopyOf(builder.foruminfo);
            }
            if (builder.groupinfo == null) {
                this.groupinfo = DEFAULT_GROUPINFO;
            } else {
                this.groupinfo = immutableCopyOf(builder.groupinfo);
            }
            if (builder.friendinfo == null) {
                this.friendinfo = DEFAULT_FRIENDINFO;
            } else {
                this.friendinfo = immutableCopyOf(builder.friendinfo);
            }
            this.distanceinfo = builder.distanceinfo;
            if (builder.groupnum == null) {
                this.groupnum = DEFAULT_GROUPNUM;
            } else {
                this.groupnum = builder.groupnum;
            }
            if (builder.friendnum == null) {
                this.friendnum = DEFAULT_FRIENDNUM;
            } else {
                this.friendnum = builder.friendnum;
            }
            if (builder.is_friend == null) {
                this.is_friend = DEFAULT_IS_FRIEND;
            } else {
                this.is_friend = builder.is_friend;
            }
            if (builder.reply_list == null) {
                this.reply_list = DEFAULT_REPLY_LIST;
            } else {
                this.reply_list = immutableCopyOf(builder.reply_list);
            }
            if (builder.userClientVersionIsLower == null) {
                this.userClientVersionIsLower = DEFAULT_USERCLIENTVERSIONISLOWER;
                return;
            } else {
                this.userClientVersionIsLower = builder.userClientVersionIsLower;
                return;
            }
        }
        this.foruminfo = immutableCopyOf(builder.foruminfo);
        this.groupinfo = immutableCopyOf(builder.groupinfo);
        this.friendinfo = immutableCopyOf(builder.friendinfo);
        this.distanceinfo = builder.distanceinfo;
        this.groupnum = builder.groupnum;
        this.friendnum = builder.friendnum;
        this.is_friend = builder.is_friend;
        this.reply_list = immutableCopyOf(builder.reply_list);
        this.userClientVersionIsLower = builder.userClientVersionIsLower;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<TAInfo> {
        public CommonDistance distanceinfo;
        public List<CommonForum> foruminfo;
        public List<CommonFriend> friendinfo;
        public Integer friendnum;
        public List<CommonGroup> groupinfo;
        public Integer groupnum;
        public Integer is_friend;
        public List<ReplyList> reply_list;
        public Integer userClientVersionIsLower;

        public Builder(TAInfo tAInfo) {
            super(tAInfo);
            if (tAInfo != null) {
                this.foruminfo = TAInfo.copyOf(tAInfo.foruminfo);
                this.groupinfo = TAInfo.copyOf(tAInfo.groupinfo);
                this.friendinfo = TAInfo.copyOf(tAInfo.friendinfo);
                this.distanceinfo = tAInfo.distanceinfo;
                this.groupnum = tAInfo.groupnum;
                this.friendnum = tAInfo.friendnum;
                this.is_friend = tAInfo.is_friend;
                this.reply_list = TAInfo.copyOf(tAInfo.reply_list);
                this.userClientVersionIsLower = tAInfo.userClientVersionIsLower;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TAInfo build(boolean z) {
            return new TAInfo(this, z, null);
        }
    }
}
