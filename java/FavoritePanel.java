package tbclient;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class FavoritePanel extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_IMG_URL = "";
    public static final String DEFAULT_MAIN_TITLE = "";
    public static final Integer DEFAULT_MAX_TIMES;
    public static final Long DEFAULT_NUMBER;
    public static final String DEFAULT_ON_OFF = "";
    public static final String DEFAULT_SUB_TITLE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String img_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String main_title;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer max_times;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long number;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String on_off;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String sub_title;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<FavoritePanel> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String img_url;
        public String main_title;
        public Integer max_times;
        public Long number;
        public String on_off;
        public String sub_title;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(FavoritePanel favoritePanel) {
            super(favoritePanel);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {favoritePanel};
                interceptable.invokeUnInit(65537, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (favoritePanel == null) {
                return;
            }
            this.main_title = favoritePanel.main_title;
            this.sub_title = favoritePanel.sub_title;
            this.number = favoritePanel.number;
            this.img_url = favoritePanel.img_url;
            this.on_off = favoritePanel.on_off;
            this.max_times = favoritePanel.max_times;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FavoritePanel build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new FavoritePanel(this, z, null) : (FavoritePanel) invokeZ.objValue;
        }
    }

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(560299741, "Ltbclient/FavoritePanel;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(560299741, "Ltbclient/FavoritePanel;");
                return;
            }
        }
        DEFAULT_NUMBER = 0L;
        DEFAULT_MAX_TIMES = 0;
    }

    public /* synthetic */ FavoritePanel(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoritePanel(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            String str = builder.main_title;
            if (str == null) {
                this.main_title = "";
            } else {
                this.main_title = str;
            }
            String str2 = builder.sub_title;
            if (str2 == null) {
                this.sub_title = "";
            } else {
                this.sub_title = str2;
            }
            Long l = builder.number;
            if (l == null) {
                this.number = DEFAULT_NUMBER;
            } else {
                this.number = l;
            }
            String str3 = builder.img_url;
            if (str3 == null) {
                this.img_url = "";
            } else {
                this.img_url = str3;
            }
            String str4 = builder.on_off;
            if (str4 == null) {
                this.on_off = "";
            } else {
                this.on_off = str4;
            }
            Integer num = builder.max_times;
            if (num == null) {
                this.max_times = DEFAULT_MAX_TIMES;
                return;
            } else {
                this.max_times = num;
                return;
            }
        }
        this.main_title = builder.main_title;
        this.sub_title = builder.sub_title;
        this.number = builder.number;
        this.img_url = builder.img_url;
        this.on_off = builder.on_off;
        this.max_times = builder.max_times;
    }
}
