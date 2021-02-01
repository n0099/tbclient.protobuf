package tbclient.GetVipInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class VipSpecialList extends Message {
    public static final String DEFAULT_CARD_ID = "";
    public static final String DEFAULT_CLASS_NAME = "";
    public static final String DEFAULT_CLASS_URL = "";
    public static final String DEFAULT_CLASS_URL_NAME = "";
    public static final List<VipSpecialItem> DEFAULT_ITEM = Collections.emptyList();
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String card_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String class_name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String class_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String class_url_name;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<VipSpecialItem> item;

    private VipSpecialList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.class_name == null) {
                this.class_name = "";
            } else {
                this.class_name = builder.class_name;
            }
            if (builder.class_url_name == null) {
                this.class_url_name = "";
            } else {
                this.class_url_name = builder.class_url_name;
            }
            if (builder.class_url == null) {
                this.class_url = "";
            } else {
                this.class_url = builder.class_url;
            }
            if (builder.item == null) {
                this.item = DEFAULT_ITEM;
            } else {
                this.item = immutableCopyOf(builder.item);
            }
            if (builder.card_id == null) {
                this.card_id = "";
                return;
            } else {
                this.card_id = builder.card_id;
                return;
            }
        }
        this.class_name = builder.class_name;
        this.class_url_name = builder.class_url_name;
        this.class_url = builder.class_url;
        this.item = immutableCopyOf(builder.item);
        this.card_id = builder.card_id;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<VipSpecialList> {
        public String card_id;
        public String class_name;
        public String class_url;
        public String class_url_name;
        public List<VipSpecialItem> item;

        public Builder() {
        }

        public Builder(VipSpecialList vipSpecialList) {
            super(vipSpecialList);
            if (vipSpecialList != null) {
                this.class_name = vipSpecialList.class_name;
                this.class_url_name = vipSpecialList.class_url_name;
                this.class_url = vipSpecialList.class_url;
                this.item = VipSpecialList.copyOf(vipSpecialList.item);
                this.card_id = vipSpecialList.card_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VipSpecialList build(boolean z) {
            return new VipSpecialList(this, z);
        }
    }
}
