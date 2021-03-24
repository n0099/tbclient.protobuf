package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class TAInfo extends Message {
    public static final String DEFAULT_HIDE_USER_FEED = "";
    @ProtoField(tag = 4)
    public final CommonDistance distanceinfo;
    @ProtoField(label = Message.Label.REPEATED, tag = 1, type = Message.Datatype.STRING)
    public final List<String> foruminfo;
    @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.STRING)
    public final List<String> friendinfo;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer friendnum;
    @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
    public final List<String> groupinfo;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer groupnum;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String hide_user_feed;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer is_friend;
    @ProtoField(tag = 10)
    public final CommonLocation location;
    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<ReplyList> reply_list;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer userClientVersionIsLower;
    public static final List<String> DEFAULT_FORUMINFO = Collections.emptyList();
    public static final List<String> DEFAULT_GROUPINFO = Collections.emptyList();
    public static final List<String> DEFAULT_FRIENDINFO = Collections.emptyList();
    public static final Integer DEFAULT_GROUPNUM = 0;
    public static final Integer DEFAULT_FRIENDNUM = 0;
    public static final Integer DEFAULT_IS_FRIEND = 0;
    public static final List<ReplyList> DEFAULT_REPLY_LIST = Collections.emptyList();
    public static final Integer DEFAULT_USERCLIENTVERSIONISLOWER = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<TAInfo> {
        public CommonDistance distanceinfo;
        public List<String> foruminfo;
        public List<String> friendinfo;
        public Integer friendnum;
        public List<String> groupinfo;
        public Integer groupnum;
        public String hide_user_feed;
        public Integer is_friend;
        public CommonLocation location;
        public List<ReplyList> reply_list;
        public Integer userClientVersionIsLower;

        public Builder() {
        }

        public Builder(TAInfo tAInfo) {
            super(tAInfo);
            if (tAInfo == null) {
                return;
            }
            this.foruminfo = Message.copyOf(tAInfo.foruminfo);
            this.groupinfo = Message.copyOf(tAInfo.groupinfo);
            this.friendinfo = Message.copyOf(tAInfo.friendinfo);
            this.distanceinfo = tAInfo.distanceinfo;
            this.groupnum = tAInfo.groupnum;
            this.friendnum = tAInfo.friendnum;
            this.is_friend = tAInfo.is_friend;
            this.reply_list = Message.copyOf(tAInfo.reply_list);
            this.userClientVersionIsLower = tAInfo.userClientVersionIsLower;
            this.location = tAInfo.location;
            this.hide_user_feed = tAInfo.hide_user_feed;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TAInfo build(boolean z) {
            return new TAInfo(this, z);
        }
    }

    public TAInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<String> list = builder.foruminfo;
            if (list == null) {
                this.foruminfo = DEFAULT_FORUMINFO;
            } else {
                this.foruminfo = Message.immutableCopyOf(list);
            }
            List<String> list2 = builder.groupinfo;
            if (list2 == null) {
                this.groupinfo = DEFAULT_GROUPINFO;
            } else {
                this.groupinfo = Message.immutableCopyOf(list2);
            }
            List<String> list3 = builder.friendinfo;
            if (list3 == null) {
                this.friendinfo = DEFAULT_FRIENDINFO;
            } else {
                this.friendinfo = Message.immutableCopyOf(list3);
            }
            this.distanceinfo = builder.distanceinfo;
            Integer num = builder.groupnum;
            if (num == null) {
                this.groupnum = DEFAULT_GROUPNUM;
            } else {
                this.groupnum = num;
            }
            Integer num2 = builder.friendnum;
            if (num2 == null) {
                this.friendnum = DEFAULT_FRIENDNUM;
            } else {
                this.friendnum = num2;
            }
            Integer num3 = builder.is_friend;
            if (num3 == null) {
                this.is_friend = DEFAULT_IS_FRIEND;
            } else {
                this.is_friend = num3;
            }
            List<ReplyList> list4 = builder.reply_list;
            if (list4 == null) {
                this.reply_list = DEFAULT_REPLY_LIST;
            } else {
                this.reply_list = Message.immutableCopyOf(list4);
            }
            Integer num4 = builder.userClientVersionIsLower;
            if (num4 == null) {
                this.userClientVersionIsLower = DEFAULT_USERCLIENTVERSIONISLOWER;
            } else {
                this.userClientVersionIsLower = num4;
            }
            this.location = builder.location;
            String str = builder.hide_user_feed;
            if (str == null) {
                this.hide_user_feed = "";
                return;
            } else {
                this.hide_user_feed = str;
                return;
            }
        }
        this.foruminfo = Message.immutableCopyOf(builder.foruminfo);
        this.groupinfo = Message.immutableCopyOf(builder.groupinfo);
        this.friendinfo = Message.immutableCopyOf(builder.friendinfo);
        this.distanceinfo = builder.distanceinfo;
        this.groupnum = builder.groupnum;
        this.friendnum = builder.friendnum;
        this.is_friend = builder.is_friend;
        this.reply_list = Message.immutableCopyOf(builder.reply_list);
        this.userClientVersionIsLower = builder.userClientVersionIsLower;
        this.location = builder.location;
        this.hide_user_feed = builder.hide_user_feed;
    }
}
