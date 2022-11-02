package tbclient.GetTails;

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
import java.util.Collections;
import java.util.List;
import tbclient.ThemeTailInUser;
/* loaded from: classes9.dex */
public final class ResData extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final List<ColorInfo> DEFAULT_COLORLIST;
    public static final String DEFAULT_DEFAULT_COLOR = "";
    public static final List<TailInfo> DEFAULT_TAILLIST;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ColorInfo> colorList;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String default_color;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<TailInfo> tailList;
    @ProtoField(tag = 4)
    public final ThemeTailInUser tail_style;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ResData> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<ColorInfo> colorList;
        public String default_color;
        public List<TailInfo> tailList;
        public ThemeTailInUser tail_style;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(ResData resData) {
            super(resData);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {resData};
                interceptable.invokeUnInit(65537, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (resData == null) {
                return;
            }
            this.tailList = Message.copyOf(resData.tailList);
            this.colorList = Message.copyOf(resData.colorList);
            this.default_color = resData.default_color;
            this.tail_style = resData.tail_style;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ResData build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new ResData(this, z, null);
            }
            return (ResData) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1748054807, "Ltbclient/GetTails/ResData;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1748054807, "Ltbclient/GetTails/ResData;");
                return;
            }
        }
        DEFAULT_TAILLIST = Collections.emptyList();
        DEFAULT_COLORLIST = Collections.emptyList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResData(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i = newInitContext.flag;
            if ((i & 1) != 0) {
                int i2 = i & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            List<TailInfo> list = builder.tailList;
            if (list == null) {
                this.tailList = DEFAULT_TAILLIST;
            } else {
                this.tailList = Message.immutableCopyOf(list);
            }
            List<ColorInfo> list2 = builder.colorList;
            if (list2 == null) {
                this.colorList = DEFAULT_COLORLIST;
            } else {
                this.colorList = Message.immutableCopyOf(list2);
            }
            String str = builder.default_color;
            if (str == null) {
                this.default_color = "";
            } else {
                this.default_color = str;
            }
            this.tail_style = builder.tail_style;
            return;
        }
        this.tailList = Message.immutableCopyOf(builder.tailList);
        this.colorList = Message.immutableCopyOf(builder.colorList);
        this.default_color = builder.default_color;
        this.tail_style = builder.tail_style;
    }

    public /* synthetic */ ResData(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
