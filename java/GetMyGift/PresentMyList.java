package tbclient.GetMyGift;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class PresentMyList extends Message {
    public static final String DEFAULT_GIFT_NAME = "";
    public static final String DEFAULT_PAY_USERNAME = "";
    public static final String DEFAULT_PLAY_URL = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_THUMBNAIL_URL = "";
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer create_time;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer gift_id;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String gift_name;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer num;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long pay_userid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String pay_username;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String play_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String thumbnail_url;
    public static final Long DEFAULT_PAY_USERID = 0L;
    public static final Integer DEFAULT_GIFT_ID = 0;
    public static final Integer DEFAULT_CREATE_TIME = 0;
    public static final Integer DEFAULT_NUM = 0;

    /* synthetic */ PresentMyList(Builder builder, boolean z, PresentMyList presentMyList) {
        this(builder, z);
    }

    private PresentMyList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.pay_userid == null) {
                this.pay_userid = DEFAULT_PAY_USERID;
            } else {
                this.pay_userid = builder.pay_userid;
            }
            if (builder.pay_username == null) {
                this.pay_username = "";
            } else {
                this.pay_username = builder.pay_username;
            }
            if (builder.portrait == null) {
                this.portrait = "";
            } else {
                this.portrait = builder.portrait;
            }
            if (builder.gift_id == null) {
                this.gift_id = DEFAULT_GIFT_ID;
            } else {
                this.gift_id = builder.gift_id;
            }
            if (builder.gift_name == null) {
                this.gift_name = "";
            } else {
                this.gift_name = builder.gift_name;
            }
            if (builder.play_url == null) {
                this.play_url = "";
            } else {
                this.play_url = builder.play_url;
            }
            if (builder.thumbnail_url == null) {
                this.thumbnail_url = "";
            } else {
                this.thumbnail_url = builder.thumbnail_url;
            }
            if (builder.create_time == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = builder.create_time;
            }
            if (builder.num == null) {
                this.num = DEFAULT_NUM;
                return;
            } else {
                this.num = builder.num;
                return;
            }
        }
        this.pay_userid = builder.pay_userid;
        this.pay_username = builder.pay_username;
        this.portrait = builder.portrait;
        this.gift_id = builder.gift_id;
        this.gift_name = builder.gift_name;
        this.play_url = builder.play_url;
        this.thumbnail_url = builder.thumbnail_url;
        this.create_time = builder.create_time;
        this.num = builder.num;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<PresentMyList> {
        public Integer create_time;
        public Integer gift_id;
        public String gift_name;
        public Integer num;
        public Long pay_userid;
        public String pay_username;
        public String play_url;
        public String portrait;
        public String thumbnail_url;

        public Builder() {
        }

        public Builder(PresentMyList presentMyList) {
            super(presentMyList);
            if (presentMyList != null) {
                this.pay_userid = presentMyList.pay_userid;
                this.pay_username = presentMyList.pay_username;
                this.portrait = presentMyList.portrait;
                this.gift_id = presentMyList.gift_id;
                this.gift_name = presentMyList.gift_name;
                this.play_url = presentMyList.play_url;
                this.thumbnail_url = presentMyList.thumbnail_url;
                this.create_time = presentMyList.create_time;
                this.num = presentMyList.num;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PresentMyList build(boolean z) {
            return new PresentMyList(this, z, null);
        }
    }
}
