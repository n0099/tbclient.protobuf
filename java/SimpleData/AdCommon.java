package tbclient.SimpleData;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class AdCommon extends Message {
    public static final String DEFAULT_JUMP_URL = "";
    public static final String DEFAULT_PARALLEL_CHARGE_URL = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 2)
    public final Brand brand;
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<BannerFlag> flag_names;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<BrandImage> images;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String jump_url;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String parallel_charge_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    public static final List<BrandImage> DEFAULT_IMAGES = Collections.emptyList();
    public static final List<BannerFlag> DEFAULT_FLAG_NAMES = Collections.emptyList();

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<AdCommon> {
        public Brand brand;
        public List<BannerFlag> flag_names;
        public List<BrandImage> images;
        public String jump_url;
        public String parallel_charge_url;
        public String title;

        public Builder() {
        }

        public Builder(AdCommon adCommon) {
            super(adCommon);
            if (adCommon == null) {
                return;
            }
            this.title = adCommon.title;
            this.brand = adCommon.brand;
            this.images = Message.copyOf(adCommon.images);
            this.jump_url = adCommon.jump_url;
            this.parallel_charge_url = adCommon.parallel_charge_url;
            this.flag_names = Message.copyOf(adCommon.flag_names);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AdCommon build(boolean z) {
            return new AdCommon(this, z);
        }
    }

    public AdCommon(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            this.brand = builder.brand;
            List<BrandImage> list = builder.images;
            if (list == null) {
                this.images = DEFAULT_IMAGES;
            } else {
                this.images = Message.immutableCopyOf(list);
            }
            String str2 = builder.jump_url;
            if (str2 == null) {
                this.jump_url = "";
            } else {
                this.jump_url = str2;
            }
            String str3 = builder.parallel_charge_url;
            if (str3 == null) {
                this.parallel_charge_url = "";
            } else {
                this.parallel_charge_url = str3;
            }
            List<BannerFlag> list2 = builder.flag_names;
            if (list2 == null) {
                this.flag_names = DEFAULT_FLAG_NAMES;
                return;
            } else {
                this.flag_names = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.title = builder.title;
        this.brand = builder.brand;
        this.images = Message.immutableCopyOf(builder.images);
        this.jump_url = builder.jump_url;
        this.parallel_charge_url = builder.parallel_charge_url;
        this.flag_names = Message.immutableCopyOf(builder.flag_names);
    }
}
