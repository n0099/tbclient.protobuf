package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class RewardCard extends Message {
    public static final String DEFAULT_BANNER_JUMP_URL = "";
    public static final String DEFAULT_BUTTON_TEXT = "";
    public static final String DEFAULT_END_TEXT = "";
    public static final String DEFAULT_END_TIME = "";
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_ID = "";
    public static final String DEFAULT_JOIN_NUM = "";
    public static final String DEFAULT_JOIN_SUCC_TEXT = "";
    public static final String DEFAULT_JUMP_URL = "";
    public static final String DEFAULT_START_TEXT = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_TOTAL_NUM = "";
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String banner_jump_url;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String button_text;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String end_text;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String end_time;
    @ProtoField(label = Message.Label.REPEATED, tag = 13, type = Message.Datatype.STRING)
    public final List<String> head_imgs;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String id;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String join_num;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String join_succ_text;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String jump_url;
    @ProtoField(label = Message.Label.REPEATED, tag = 11)
    public final List<RewardMaterial> reward_material;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String start_text;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String total_num;
    public static final List<RewardMaterial> DEFAULT_REWARD_MATERIAL = Collections.emptyList();
    public static final List<String> DEFAULT_HEAD_IMGS = Collections.emptyList();

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<RewardCard> {
        public String banner_jump_url;
        public String button_text;
        public String end_text;
        public String end_time;
        public List<String> head_imgs;
        public String icon;
        public String id;
        public String join_num;
        public String join_succ_text;
        public String jump_url;
        public List<RewardMaterial> reward_material;
        public String start_text;
        public String title;
        public String total_num;

        public Builder() {
        }

        public Builder(RewardCard rewardCard) {
            super(rewardCard);
            if (rewardCard == null) {
                return;
            }
            this.id = rewardCard.id;
            this.icon = rewardCard.icon;
            this.title = rewardCard.title;
            this.start_text = rewardCard.start_text;
            this.end_text = rewardCard.end_text;
            this.end_time = rewardCard.end_time;
            this.button_text = rewardCard.button_text;
            this.jump_url = rewardCard.jump_url;
            this.join_num = rewardCard.join_num;
            this.reward_material = Message.copyOf(rewardCard.reward_material);
            this.total_num = rewardCard.total_num;
            this.head_imgs = Message.copyOf(rewardCard.head_imgs);
            this.join_succ_text = rewardCard.join_succ_text;
            this.banner_jump_url = rewardCard.banner_jump_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RewardCard build(boolean z) {
            return new RewardCard(this, z);
        }
    }

    public RewardCard(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.id;
            if (str == null) {
                this.id = "";
            } else {
                this.id = str;
            }
            String str2 = builder.icon;
            if (str2 == null) {
                this.icon = "";
            } else {
                this.icon = str2;
            }
            String str3 = builder.title;
            if (str3 == null) {
                this.title = "";
            } else {
                this.title = str3;
            }
            String str4 = builder.start_text;
            if (str4 == null) {
                this.start_text = "";
            } else {
                this.start_text = str4;
            }
            String str5 = builder.end_text;
            if (str5 == null) {
                this.end_text = "";
            } else {
                this.end_text = str5;
            }
            String str6 = builder.end_time;
            if (str6 == null) {
                this.end_time = "";
            } else {
                this.end_time = str6;
            }
            String str7 = builder.button_text;
            if (str7 == null) {
                this.button_text = "";
            } else {
                this.button_text = str7;
            }
            String str8 = builder.jump_url;
            if (str8 == null) {
                this.jump_url = "";
            } else {
                this.jump_url = str8;
            }
            String str9 = builder.join_num;
            if (str9 == null) {
                this.join_num = "";
            } else {
                this.join_num = str9;
            }
            List<RewardMaterial> list = builder.reward_material;
            if (list == null) {
                this.reward_material = DEFAULT_REWARD_MATERIAL;
            } else {
                this.reward_material = Message.immutableCopyOf(list);
            }
            String str10 = builder.total_num;
            if (str10 == null) {
                this.total_num = "";
            } else {
                this.total_num = str10;
            }
            List<String> list2 = builder.head_imgs;
            if (list2 == null) {
                this.head_imgs = DEFAULT_HEAD_IMGS;
            } else {
                this.head_imgs = Message.immutableCopyOf(list2);
            }
            String str11 = builder.join_succ_text;
            if (str11 == null) {
                this.join_succ_text = "";
            } else {
                this.join_succ_text = str11;
            }
            String str12 = builder.banner_jump_url;
            if (str12 == null) {
                this.banner_jump_url = "";
                return;
            } else {
                this.banner_jump_url = str12;
                return;
            }
        }
        this.id = builder.id;
        this.icon = builder.icon;
        this.title = builder.title;
        this.start_text = builder.start_text;
        this.end_text = builder.end_text;
        this.end_time = builder.end_time;
        this.button_text = builder.button_text;
        this.jump_url = builder.jump_url;
        this.join_num = builder.join_num;
        this.reward_material = Message.immutableCopyOf(builder.reward_material);
        this.total_num = builder.total_num;
        this.head_imgs = Message.immutableCopyOf(builder.head_imgs);
        this.join_succ_text = builder.join_succ_text;
        this.banner_jump_url = builder.banner_jump_url;
    }
}
