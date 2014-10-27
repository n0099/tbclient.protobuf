package tbclient.GetGiftCommonList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class GiftList extends Message {
    public static final String DEFAULT_TYPE_NAME = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<Item> item;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer type_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String type_name;
    public static final Integer DEFAULT_TYPE_ID = 0;
    public static final List<Item> DEFAULT_ITEM = Collections.emptyList();

    /* synthetic */ GiftList(Builder builder, boolean z, GiftList giftList) {
        this(builder, z);
    }

    private GiftList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.type_name == null) {
                this.type_name = "";
            } else {
                this.type_name = builder.type_name;
            }
            if (builder.type_id == null) {
                this.type_id = DEFAULT_TYPE_ID;
            } else {
                this.type_id = builder.type_id;
            }
            if (builder.item == null) {
                this.item = DEFAULT_ITEM;
                return;
            } else {
                this.item = immutableCopyOf(builder.item);
                return;
            }
        }
        this.type_name = builder.type_name;
        this.type_id = builder.type_id;
        this.item = immutableCopyOf(builder.item);
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<GiftList> {
        public List<Item> item;
        public Integer type_id;
        public String type_name;

        public Builder(GiftList giftList) {
            super(giftList);
            if (giftList != null) {
                this.type_name = giftList.type_name;
                this.type_id = giftList.type_id;
                this.item = GiftList.copyOf(giftList.item);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GiftList build(boolean z) {
            return new GiftList(this, z, null);
        }
    }
}
